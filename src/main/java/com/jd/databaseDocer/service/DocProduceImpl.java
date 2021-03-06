package com.jd.databaseDocer.service;

import com.jd.databaseDocer.Dao.Mysql;
import com.jd.databaseDocer.entity.ColumnInfo;
import com.jd.databaseDocer.entity.TableInfo;
import com.jd.databaseDocer.poi.ExcelHelper;

import javax.swing.*;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yanghui10 on 2016/8/20.
 */
public class DocProduceImpl implements DocProduce {
    ExcelHelper excelHelper=new ExcelHelper();

    /**
     * 导出的实现(读写同步)
     * @param tableInfos
     */
    public void export(List<TableInfo> tableInfos,String path) throws Exception{
        Map<TableInfo, List<ColumnInfo>> tableStructures=new LinkedHashMap<TableInfo, List<ColumnInfo>>();
        for(TableInfo tableInfo:tableInfos){
            List<ColumnInfo> columnInfos=Mysql.getColumnInfosByTableName(tableInfo.getTableName());
            tableInfo.setColumnInfo(columnInfos);
//            List<ColumnInfo> columnInfos=Mysql.getColumnInfosByTableName2(tableInfo.getTableName());
            tableStructures.put(tableInfo,columnInfos);
        }
        excelHelper.export(tableStructures,path);
//        excelHelper.exportSys_dict_codeNotUse();
    } /**
     * 导出的实现(读写同步)
     * @param tableInfos
     */
    public void export(TableInfo[] tableInfos,String path) throws Exception{
        Map<TableInfo, List<ColumnInfo>> tableStructures=new LinkedHashMap<TableInfo, List<ColumnInfo>>();
        for(TableInfo tableInfo:tableInfos){
            List<ColumnInfo> columnInfos=Mysql.getColumnInfosByTableName(tableInfo.getTableName());
            tableInfo.setColumnInfo(columnInfos);
//            List<ColumnInfo> columnInfos=Mysql.getColumnInfosByTableName2(tableInfo.getTableName());
            tableStructures.put(tableInfo,columnInfos);
        }
        excelHelper.export(tableStructures,path);
//        excelHelper.exportSys_dict_codeNotUse();
    }
//    public void asynExport(List<TableInfo> tableInfos,String path) throws Exception{
//        Map<TableInfo, List<ColumnInfo>> tableStructures=new LinkedHashMap<TableInfo, List<ColumnInfo>>();
//        for(TableInfo tableInfo:tableInfos){
//            List<ColumnInfo> columnInfos=Mysql.getColumnInfosByTableName(tableInfo.getTableName());
////            List<ColumnInfo> columnInfos=Mysql.getColumnInfosByTableName2(tableInfo.getTableName());
//            tableInfo.setColumnInfo(columnInfos);
//
//            tableStructures.put(tableInfo,columnInfos);
//        }
//        excelHelper.export(tableStructures,path);
//    }

}
