package com.skyline.common.mapper;

import java.util.LinkedHashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * �����ƣ�ͨ��Mapper����չ <br/>
 * ��������֧��sql��ѯ <br/>
 * �����ˣ� lishanglong <br/>
 * 
 * @updateRemark �޸ı�ע��
 */
public interface GenMapper {

    /**
     * @param sql ִ��sql
     * @return
     * @author lishanglong
     */
    List<LinkedHashMap<String, Object>> queryBySql(@Param("sql")String sql);

    /**
     * �������
     * @param table ������
     * @param params ��Ĳ������ƿ���Ϊnull
     * @param sortStr �����ֶ����ƿ���Ϊnull
     * @return
     * @author lishanglong
     */
    List<LinkedHashMap<String, Object>> queryBySqlParam(@Param("table") String table,
            @Param("params") List<String> params,@Param("sortSrt") String sortStr);
    
    

}
