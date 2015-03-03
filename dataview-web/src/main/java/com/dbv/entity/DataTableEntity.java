package com.dbv.entity;

import javax.persistence.*;

/**
 * Created by firnice on 15/3/3.
 */
@Entity
@Table(name = "DATA_TABLE", schema = "PUBLIC", catalog = "DBV")
public class DataTableEntity {
    private String id;
    private String dataSourceFactoryId;
    private String tableName;
    private String tableRemark;

    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DATA_SOURCE_FACTORY_ID")
    public String getDataSourceFactoryId() {
        return dataSourceFactoryId;
    }

    public void setDataSourceFactoryId(String dataSourceFactoryId) {
        this.dataSourceFactoryId = dataSourceFactoryId;
    }

    @Basic
    @Column(name = "TABLE_NAME")
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Basic
    @Column(name = "TABLE_REMARK")
    public String getTableRemark() {
        return tableRemark;
    }

    public void setTableRemark(String tableRemark) {
        this.tableRemark = tableRemark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DataTableEntity that = (DataTableEntity) o;

        if (dataSourceFactoryId != null ? !dataSourceFactoryId.equals(that.dataSourceFactoryId) : that.dataSourceFactoryId != null)
            return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (tableName != null ? !tableName.equals(that.tableName) : that.tableName != null) return false;
        if (tableRemark != null ? !tableRemark.equals(that.tableRemark) : that.tableRemark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (dataSourceFactoryId != null ? dataSourceFactoryId.hashCode() : 0);
        result = 31 * result + (tableName != null ? tableName.hashCode() : 0);
        result = 31 * result + (tableRemark != null ? tableRemark.hashCode() : 0);
        return result;
    }
}
