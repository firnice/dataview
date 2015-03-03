package com.dbv.entity;

import javax.persistence.*;

/**
 * Created by firnice on 15/3/3.
 */
@Entity
@Table(name = "DATA_COLUMN", schema = "PUBLIC", catalog = "DBV")
public class DataColumnEntity {
    private String id;
    private String dataTableId;
    private String colName;
    private String colLength;
    private String colRemark;

    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DATA_TABLE_ID")
    public String getDataTableId() {
        return dataTableId;
    }

    public void setDataTableId(String dataTableId) {
        this.dataTableId = dataTableId;
    }

    @Basic
    @Column(name = "COL_NAME")
    public String getColName() {
        return colName;
    }

    public void setColName(String colName) {
        this.colName = colName;
    }

    @Basic
    @Column(name = "COL_LENGTH")
    public String getColLength() {
        return colLength;
    }

    public void setColLength(String colLength) {
        this.colLength = colLength;
    }

    @Basic
    @Column(name = "COL_REMARK")
    public String getColRemark() {
        return colRemark;
    }

    public void setColRemark(String colRemark) {
        this.colRemark = colRemark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DataColumnEntity that = (DataColumnEntity) o;

        if (colLength != null ? !colLength.equals(that.colLength) : that.colLength != null) return false;
        if (colName != null ? !colName.equals(that.colName) : that.colName != null) return false;
        if (colRemark != null ? !colRemark.equals(that.colRemark) : that.colRemark != null) return false;
        if (dataTableId != null ? !dataTableId.equals(that.dataTableId) : that.dataTableId != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (dataTableId != null ? dataTableId.hashCode() : 0);
        result = 31 * result + (colName != null ? colName.hashCode() : 0);
        result = 31 * result + (colLength != null ? colLength.hashCode() : 0);
        result = 31 * result + (colRemark != null ? colRemark.hashCode() : 0);
        return result;
    }
}
