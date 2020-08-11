package com.qf.dao;

import com.qf.dto.GoodsInfoDTO;
import com.qf.pojo.GoodsInfo;
import com.qf.pojo.GoodsTypeInfo;
import com.qf.vo.CartVO;
import com.qf.vo.FavouriteVO;
import com.qf.vo.GoodsVO;
import com.qf.vo.RecordsVO;

import java.util.List;

public interface GoodsInfoMapper {
    public List<GoodsInfo> listAll();
//    单个移除商品
    public int removeGoodsInfoById(int id);
    public int removeFavouriteGoods(int id);
    public int removeRecordsGoods(int id);

    public int addGoodsInfo(GoodsInfo goodsInfo);

    public List<CartVO> getAll();

    public int addCart(CartVO cartVO);

    public Object getCartInfoById(int id);

    public List<GoodsInfo> getCart(CartVO cartVO);

    /**
     * 购物车单独删除商品
     * @param cartVO
     * @return
     */
    public int removeGoodsFromCart(CartVO cartVO);

    public int checkCart(CartVO cartVO);

    public int checkFavourite(FavouriteVO favouriteVO);

    /**
     * 购物车商品重复,商品上架并且数量加一
     *
     * @param 
     * @return
     */
    public int addCartQuantity( CartVO cartVO);

    /**
     * 收藏夹商品重复,商品上架
     *
     * @param favouriteVO
     * @return
     */
    public int putAwayFavourite(FavouriteVO favouriteVO);

    public List<GoodsVO> getAllgoodsInfo();

    /**
     * 批量删除购物车中商品
     *
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
     *
     * @param id
     * @return
     */
    public Object getGoodsInfoById(int id);

    /**
     * 获取下拉框类别
     *
     * @return
     */
    public List<GoodsTypeInfo> listAllTypes();

    /**
     * 通过下拉框分类商品
     *
     * @param typeName
     * @return
     */
    public List<GoodsInfo> selectGoodsByType(String typeName);

    /**
     * 条件查询商品
     *
     * @return
     */
    public List<GoodsInfo> searchGoods(GoodsInfoDTO goodsInfoDTO);

    /**
     * 发送商品ID到我的足迹和收藏夹
     *
     * @param recordsVO
     * @return
     */
    public int addToRecords(RecordsVO recordsVO);

    public int addToMyFavourite(FavouriteVO favouriteVO);

    /**
     * 展示收藏夹所有商品
     *
     * @return
     */
    public List<FavouriteVO> listAllFavourite(FavouriteVO favouriteVO);

    /**
     * 展示我的足迹所有商品
     *
     * @return
     */
    public List<RecordsVO> listAllRecords(RecordsVO recordsVO);

}
