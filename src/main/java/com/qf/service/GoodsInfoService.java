package com.qf.service;

import com.qf.dto.GoodsInfoDTO;
import com.qf.pojo.GoodsInfo;
import com.qf.pojo.GoodsTypeInfo;
import com.qf.vo.CartVO;
import com.qf.vo.FavouriteVO;
import com.qf.vo.GoodsVO;
import com.qf.vo.RecordsVO;

import java.util.List;

public interface GoodsInfoService {
    public List<GoodsInfo> listAll();
    /**
     * 条件查询商品
     * @return
     */
    public List<GoodsInfo> searchGoods(GoodsInfoDTO goodsInfoDTO);
    public boolean removeGoodsInfoById(int id);
    public boolean removeFavouriteGoods(int id);
    public boolean removeRecordsGoods(int id);
    public int addGoodsInfo(GoodsInfo goodsInfo);
    public List<CartVO> getAll();

    /**
     * 加入购物车
     * @param 
     * @return
     */
    public int addCart(CartVO cartVO);

    /**
     * 根据商品拿出商品
     * @param goodsid
     * @return
     */
    public Object getCartInfoById(int goodsid);
    public List<GoodsInfo> getCart(CartVO cartVO);
    public int removeGoodsFromCart(CartVO cartVO);

    /**
     * 判断购物车商品是否已存在
     * @param 
     * @return
     */
    public boolean checkCart(CartVO cartVO);
    public boolean checkFavourite(FavouriteVO favouriteVO);

    /**
     * 购物车商品重复 数量+1
     * @param cartVO
     * @return
     */
    public int addCartQuantity(CartVO cartVO);
    public int putAwayFavourite(FavouriteVO favouriteVO);
    public List<GoodsVO> getAllgoodsInfo();

    /**
     * 批量删除购物车中商品
     * @param 
     * @return
     */
    public Integer allDel(Integer[] ids);

    /**
     * 批量删除收藏夹中商品
     *
     * @param ids
     * @return
     */
    public Integer allFavoriteDel(Integer[] ids);
    /**
     * 批量删除我的足迹中商品
     *
     * @param ids
     * @return
     */
    public Integer allDelRecords(Integer[] ids);

    /**
     * 根据商品id在商品详情页获取商品
     * @param id
     * @return
     */
    public Object getGoodsInfoById(int id);

    /**
     * 获取下拉框类别
     * @return
     */
    public List<GoodsTypeInfo> listAllTypes();

    /**
     * 根据下拉框选取的类别名获得商品
     * @param typeName 下拉框选取的类别名
     * @return
     */
    public List<GoodsInfo> selectGoodsByType(String  typeName);
    /**
     * 发送商品ID到我的足迹和收藏夹
     * @param recordsVO
     * @return
     */
    public int addToRecords(RecordsVO recordsVO);
    public int addToMyFavourite(FavouriteVO favouriteVO);
    /**
     * 展示收藏夹所有商品
     * @return
     */
    public List<FavouriteVO> listAllFavourite(FavouriteVO favouriteVO);   
    /**
     * 展示我的足迹所有商品
     * @return
     */
    public List<RecordsVO> listAllRecords(RecordsVO recordsVO);



}
