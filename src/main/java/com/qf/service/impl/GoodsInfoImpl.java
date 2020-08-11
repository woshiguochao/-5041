package com.qf.service.impl;

import com.qf.dao.GoodsInfoMapper;
import com.qf.dto.GoodsInfoDTO;
import com.qf.pojo.GoodsInfo;
import com.qf.pojo.GoodsTypeInfo;
import com.qf.service.GoodsInfoService;
import com.qf.vo.CartVO;
import com.qf.vo.FavouriteVO;
import com.qf.vo.GoodsVO;
import com.qf.vo.RecordsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsInfoImpl implements GoodsInfoService {
    @Autowired
    GoodsInfoMapper goodsInfoMapper;

    public List<GoodsInfo> listAll() {
        List<GoodsInfo> goodsInfos = this.goodsInfoMapper.listAll();
        return goodsInfos;
    }

    public List<GoodsInfo> searchGoods(GoodsInfoDTO goodsInfoDTO) {
        return this.goodsInfoMapper.searchGoods(goodsInfoDTO);
    }

    public boolean removeGoodsInfoById(int id) {
        int i = this.goodsInfoMapper.removeGoodsInfoById(id);
        return i > 0;
    }

    public boolean removeFavouriteGoods(int id) {
        int i = this.goodsInfoMapper.removeFavouriteGoods(id);
        return i > 0;
    }

    public boolean removeRecordsGoods(int id) {
        return this.goodsInfoMapper.removeRecordsGoods(id)>0;
    }

    public int addGoodsInfo(GoodsInfo goodsInfo) {
        int i = this.goodsInfoMapper.addGoodsInfo(goodsInfo);
        return i;
    }

    public List<CartVO> getAll() {
        return goodsInfoMapper.getAll();
    }


    public int addCart(CartVO cartVO) {
        return goodsInfoMapper.addCart(cartVO);
    }


    public Object getCartInfoById(int id) {
        return goodsInfoMapper.getCartInfoById(id);
    }

    public List<GoodsInfo> getCart(CartVO cartVO) {
        return goodsInfoMapper.getCart(cartVO);
    }

    public int removeGoodsFromCart(CartVO cartVO) {
        return goodsInfoMapper.removeGoodsFromCart(cartVO);
    }

    public boolean checkCart(CartVO cartVO) {
        return goodsInfoMapper.checkCart(cartVO) > 0;
    }

    public boolean checkFavourite(FavouriteVO favouriteVO) {
        return goodsInfoMapper.checkFavourite(favouriteVO)>0;
    }

    public int addCartQuantity(CartVO cartVO) {
        return goodsInfoMapper.addCartQuantity(cartVO);
    }

    public int putAwayFavourite(FavouriteVO favouriteVO) {
        return goodsInfoMapper.putAwayFavourite(favouriteVO);
    }

    public List<GoodsVO> getAllgoodsInfo() {
        return goodsInfoMapper.getAllgoodsInfo();
    }

    public Integer allDel(Integer[] ids) {
        return goodsInfoMapper.allDel(ids);
    }

    public Integer allFavoriteDel(Integer[] ids) {
        return goodsInfoMapper.allFavoriteDel(ids);
    }

    public Integer allDelRecords(Integer[] ids) {
        return goodsInfoMapper.allDelRecords(ids);
    }

    public Object getGoodsInfoById(int id) {
        return goodsInfoMapper.getGoodsInfoById(id);
    }

    public List<GoodsTypeInfo> listAllTypes() {
        return goodsInfoMapper.listAllTypes();
    }

    public List<GoodsInfo> selectGoodsByType(String typeName) {
        return goodsInfoMapper.selectGoodsByType(typeName);
    }

    public int addToRecords(RecordsVO recordsVO) {
        return goodsInfoMapper.addToRecords(recordsVO);
    }

    public int addToMyFavourite(FavouriteVO favouriteVO) {
        return goodsInfoMapper.addToMyFavourite(favouriteVO);
    }

    public List<FavouriteVO> listAllFavourite(FavouriteVO favouriteVO) {
        return goodsInfoMapper.listAllFavourite(favouriteVO);
    }
    public List<RecordsVO> listAllRecords(RecordsVO recordsVO) {
        return goodsInfoMapper.listAllRecords(recordsVO);
    }


}


