package com.qf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.dto.GoodsInfoDTO;
import com.qf.dto.UserCartDTO;
import com.qf.dto.UserGoodsDTO;
import com.qf.pojo.GoodsInfo;
import com.qf.pojo.GoodsTypeInfo;
import com.qf.pojo.User;
import com.qf.service.GoodsInfoService;
import com.qf.vo.CartVO;
import com.qf.vo.FavouriteVO;
import com.qf.vo.GoodsVO;
import com.qf.vo.RecordsVO;
import lombok.experimental.var;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class GoodsInfoController {
    @Autowired
    GoodsInfoService goodsInfoService;

    //  获取商品信息并分页
    @RequestMapping("listAll")
    public Object listAll(@RequestParam(required = true, defaultValue = "1", value = "pageNum") Integer pageNum) {
        int defaultPageSize = 6;
        PageHelper.startPage(pageNum, defaultPageSize);
        List<GoodsInfo> goodsInfos = goodsInfoService.listAll();
        PageInfo<GoodsInfo> menuListVOPageInfo = new PageInfo<GoodsInfo>(goodsInfos);
        System.out.println(goodsInfos);
        return menuListVOPageInfo;
    }

    //    条件查询商品
    @RequestMapping("searchGoods")
    public List<GoodsInfo> searchGoods(@RequestBody GoodsInfoDTO goodsInfoDTO) {
        System.out.println(goodsInfoDTO);
        return this.goodsInfoService.searchGoods(goodsInfoDTO);
    }

    /**
     * 根据商品id下架商品
     *
     * @param id
     * @return
     */
    @RequestMapping("removeGoodsInfoById")
    public Object removeGoodsInfoById(@RequestParam int id) {
        System.out.println("id:" + id);
        boolean b = this.goodsInfoService.removeGoodsInfoById(id);
        return b;
    }

    /**
     * 根据商品id从收藏夹删除商品
     *
     * @param id
     * @return
     */
    @RequestMapping("removeFavouriteGoods")
    public Object removeFavouriteGoods(@RequestParam int id) {
        System.out.println("从收藏夹移除id:" + id);
        boolean b = this.goodsInfoService.removeFavouriteGoods(id);
        return b;
    }    
    /**
     * 根据商品id从我的足迹删除商品
     *
     * @param id
     * @return
     */
    @RequestMapping("removeRecordsGoods")
    public Object removeRecordsGoods(@RequestParam int id) {
        System.out.println("从我的足迹移除id:" + id);
        boolean b = this.goodsInfoService.removeRecordsGoods(id);
        return b;
    }

    /**
     * 增加主页商品信息并展示
     *
     * @param goodsInfo
     * @return
     */
    @RequestMapping("addGoodsInfo")
    public Object addGoodsInfo(@RequestBody GoodsInfo goodsInfo) {
        int i = this.goodsInfoService.addGoodsInfo(goodsInfo);
        return i;
    }

    /**
     * 将商品加入购物车
     *
     * @param cartVO
     * @return
     */
    @RequestMapping("addCart")
    public Object addCart(@RequestBody CartVO cartVO) {
//        判断是否已有此商品 
        System.out.println("进入了addCart");
        if (this.goodsInfoService.checkCart(cartVO)) {
//            商品已存在,数量+1 
            System.out.println("商品已存在,数量+1 goodsid=" + cartVO.getGoodsid());
            return this.goodsInfoService.addCartQuantity(cartVO);
        } else {
//            商品第一次添加,直接加入购物车
            GoodsInfo goodsInfo = (GoodsInfo) goodsInfoService.getCartInfoById(cartVO.getGoodsid());
            System.out.println("第一次添加goodsid=" + cartVO.getGoodsid());
            //System.out.println(goodsInfo);
//            UserGoodsDTO userGoodsDTO = new UserGoodsDTO();
//            userGoodsDTO.setGoodsInfo(goodsInfo);
//            userGoodsDTO.setUserid(cartVO.getUserid());
            return this.goodsInfoService.addCart(cartVO);
        }
    }

    /**
     * 保存商品到我的足迹和收藏夹
     *
     * @param recordsVO
     * @return
     */
    @RequestMapping("addToRecords")
    public Object addToRecords(@RequestBody  RecordsVO recordsVO) {
        System.out.println("我的足迹保存了商品id=" + recordsVO.getGoodsid());
        return this.goodsInfoService.addToRecords(recordsVO);
    }

    /**
     * 加入收藏夹并判断是否已存在
     * @param favouriteVO
     * @return
     */
    @RequestMapping("addToMyFavourite")
    public Object addToMyFavourite(@RequestBody FavouriteVO favouriteVO) {
        System.out.println("获取需要收藏的商品id=" + favouriteVO.getGoodsid());
       // HashMap<String, Object> resultMap = new HashMap<String, Object>();
//        判断收藏夹是否已有
        if (this.goodsInfoService.checkFavourite(favouriteVO)) {
//            已经有了,如果下架了就上架
            return this.goodsInfoService.putAwayFavourite(favouriteVO);
        } else {
            //第一次添加
            return this.goodsInfoService.addToMyFavourite(favouriteVO);
        }
    }

    @RequestMapping("getCartInfoById")
    public Object getCartInfoById(int id) {
        return this.goodsInfoService.getCartInfoById(id);
    }

    //获取购物车商品并分页
    @RequestMapping("getCart")
    public Object getCart(@RequestParam(required = true, defaultValue = "1", value = "pageNum") Integer pageNum,@RequestBody CartVO cartVO) {
        //一页有多少条
        int defaultPageSize = 99;
        //初始化pageHelper对象
        PageHelper.startPage(pageNum, defaultPageSize);
        List<GoodsInfo> goodsInfos = goodsInfoService.getCart(cartVO);
        PageInfo<GoodsInfo> menuListVOPageInfo = new PageInfo<GoodsInfo>(goodsInfos);
        System.out.println(goodsInfos);
        return menuListVOPageInfo;
    }
    /**
     * 展示收藏夹所有商品并分页
     *
     * @param 
     * @return
     */
    @RequestMapping("listAllFavourite")
    public Object listAllFavourite(@RequestBody FavouriteVO favouriteVO, HttpSession session) {
        User user = (User)session.getAttribute("userinfo");
        int userId = user.getUserid();
        favouriteVO.setUserid(userId);
        int pageNum = favouriteVO.getPageNum();
        int defaultPageSize = 4;
        PageHelper.startPage(pageNum, defaultPageSize);
        List<FavouriteVO> favouriteVOS = goodsInfoService.listAllFavourite(favouriteVO);
        PageInfo<FavouriteVO> menuListVOPageInfo = new PageInfo<FavouriteVO>(favouriteVOS);
        //System.out.println(favouriteVOS);
        return menuListVOPageInfo;
    }
    /**
     * 展示我的足迹所有商品并分页
     *
     * @param recordsVO
     * @return
     */
    @RequestMapping("listAllRecords")
    public Object listAllRecords(@RequestBody RecordsVO recordsVO,HttpSession session) {
        User user = (User)session.getAttribute("userinfo");
        int userId = user.getUserid();
        recordsVO.setUserid(userId);
        int pageNum = recordsVO.getPageNum();
        int defaultPageSize = 4;
        PageHelper.startPage(pageNum, defaultPageSize);
        List<RecordsVO> recordsVOS = goodsInfoService.listAllRecords(recordsVO);
        PageInfo<RecordsVO> menuListVOPageInfo = new PageInfo<RecordsVO>(recordsVOS);
        System.out.println(recordsVOS);
        return menuListVOPageInfo;
    }

    /**
     * 单个删除从购物车中商品
     * @param cartVO
     * @return
     */
    @RequestMapping("removeGoodsFromCart")
    public boolean removeGoodsFromCart(@RequestBody CartVO cartVO) {
        int i = this.goodsInfoService.removeGoodsFromCart(cartVO);
        return i > 0;
    }

    @RequestMapping("getAllgoodsInfo")
    public List<GoodsVO> getAllgoodsInfo() {
        System.out.println("获取商品");
        return this.goodsInfoService.getAllgoodsInfo();
    }

    /**
     * 批量删除购物车商品
     *
     * @param 
     * @return
     */
    @RequestMapping("allDel")
    public Map<String, Object> allDel(Integer[] ids) {
        System.out.println("批量删除controller");
        Integer result = this.goodsInfoService.allDel(ids);
        System.out.println(result);
        HashMap<String, Object> resultMap = new HashMap<String, Object>();
        if (result >= 1) {
            resultMap.put("type", "success");
        } else {
            resultMap.put("type", "error");
        }
        return resultMap;
    }

    /**
     * 批量删除收藏夹商品
     *
     * @param ids
     * @return
     */
    @RequestMapping("allFavoriteDel")
    public Map<String, Object> allFavoriteDel(Integer[] ids) {
        Integer result = this.goodsInfoService.allFavoriteDel(ids);
        System.out.println(result);
        HashMap<String, Object> resultMap = new HashMap<String, Object>();
        if (result >= 1) {
            resultMap.put("type", "success");
        } else {
            resultMap.put("type", "error");
        }
        return resultMap;
    }    
    /**
     * 批量删除我的足迹商品
     *
     * @param ids
     * @return
     */
    @RequestMapping("allDelRecords")
    public Map<String, Object> allDelRecords(Integer[] ids) {
        Integer result = this.goodsInfoService.allDelRecords(ids);
        System.out.println(result);
        HashMap<String, Object> resultMap = new HashMap<String, Object>();
        if (result >= 1) {
            resultMap.put("type", "success");
        } else {
            resultMap.put("type", "error");
        }
        return resultMap;
    }

    /**
     * 商品详情页通过商品id获取商品信息
     */
    @RequestMapping("getGoodsInfoById")
    public Object getGoodsInfoById(@RequestParam int id) {
        System.out.println("商品详情页通过商品id获取商品信息");
        return this.goodsInfoService.getGoodsInfoById(id);
    }

    /**
     * 获取所有商品类别
     *
     * @return
     */
    @RequestMapping("listAllTypes")
    public List<String> listAllTypes() {
        System.out.println("获取类别");
        List<GoodsTypeInfo> goodsTypeInfos = this.goodsInfoService.listAllTypes();
        List<String> list = new ArrayList<String>();
        for (GoodsTypeInfo item : goodsTypeInfos) {
            list.add(item.getTypeName());
        }
        return list;
    }

    /**
     * 通过下拉框分类商品
     *
     * @param typeName 前台传来的类别名
     * @return
     */
    @RequestMapping("selectGoodsByType")
    public List<GoodsInfo> selectGoodsByType(String typeName) {
        System.out.println("通过下拉框分类商品");
        return this.goodsInfoService.selectGoodsByType(typeName);
    }


 

}
