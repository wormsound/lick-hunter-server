/*
 * This file is generated by jOOQ.
 */
package com.lickhunter.web.entities.public_.tables;


import com.lickhunter.web.entities.public_.Indexes;
import com.lickhunter.web.entities.public_.Keys;
import com.lickhunter.web.entities.public_.Public;
import com.lickhunter.web.entities.public_.tables.records.AccountRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row13;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Account extends TableImpl<AccountRecord> {

    private static final long serialVersionUID = 1427592075;

    /**
     * The reference instance of <code>PUBLIC.ACCOUNT</code>
     */
    public static final Account ACCOUNT = new Account();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AccountRecord> getRecordType() {
        return AccountRecord.class;
    }

    /**
     * The column <code>PUBLIC.ACCOUNT.ID</code>.
     */
    public final TableField<AccountRecord, String> ID = createField(DSL.name("ID"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.ACCOUNT.CAN_TRADE</code>.
     */
    public final TableField<AccountRecord, Boolean> CAN_TRADE = createField(DSL.name("CAN_TRADE"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.ACCOUNT.CAN_WITHDRAW</code>.
     */
    public final TableField<AccountRecord, Boolean> CAN_WITHDRAW = createField(DSL.name("CAN_WITHDRAW"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.ACCOUNT.FEE_TIER</code>.
     */
    public final TableField<AccountRecord, Double> FEE_TIER = createField(DSL.name("FEE_TIER"), org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.ACCOUNT.MAX_WITHDRAW_AMOUNT</code>.
     */
    public final TableField<AccountRecord, Double> MAX_WITHDRAW_AMOUNT = createField(DSL.name("MAX_WITHDRAW_AMOUNT"), org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.ACCOUNT.TOTAL_INITIAL_MARGIN</code>.
     */
    public final TableField<AccountRecord, Double> TOTAL_INITIAL_MARGIN = createField(DSL.name("TOTAL_INITIAL_MARGIN"), org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.ACCOUNT.TOTAL_MAINTENANCE_MARGIN</code>.
     */
    public final TableField<AccountRecord, Double> TOTAL_MAINTENANCE_MARGIN = createField(DSL.name("TOTAL_MAINTENANCE_MARGIN"), org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.ACCOUNT.TOTAL_MARGIN_BALANCE</code>.
     */
    public final TableField<AccountRecord, Double> TOTAL_MARGIN_BALANCE = createField(DSL.name("TOTAL_MARGIN_BALANCE"), org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.ACCOUNT.TOTAL_OPEN_ORDER_INITIAL_MARGIN</code>.
     */
    public final TableField<AccountRecord, Double> TOTAL_OPEN_ORDER_INITIAL_MARGIN = createField(DSL.name("TOTAL_OPEN_ORDER_INITIAL_MARGIN"), org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.ACCOUNT.TOTAL_POSITION_INITIAL_MARGIN</code>.
     */
    public final TableField<AccountRecord, Double> TOTAL_POSITION_INITIAL_MARGIN = createField(DSL.name("TOTAL_POSITION_INITIAL_MARGIN"), org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.ACCOUNT.TOTAL_UNREALIZED_PROFIT</code>.
     */
    public final TableField<AccountRecord, Double> TOTAL_UNREALIZED_PROFIT = createField(DSL.name("TOTAL_UNREALIZED_PROFIT"), org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.ACCOUNT.TOTAL_WALLET_BALANCE</code>.
     */
    public final TableField<AccountRecord, Double> TOTAL_WALLET_BALANCE = createField(DSL.name("TOTAL_WALLET_BALANCE"), org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.ACCOUNT.UPDATE_TIME</code>.
     */
    public final TableField<AccountRecord, Long> UPDATE_TIME = createField(DSL.name("UPDATE_TIME"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>PUBLIC.ACCOUNT</code> table reference
     */
    public Account() {
        this(DSL.name("ACCOUNT"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.ACCOUNT</code> table reference
     */
    public Account(String alias) {
        this(DSL.name(alias), ACCOUNT);
    }

    /**
     * Create an aliased <code>PUBLIC.ACCOUNT</code> table reference
     */
    public Account(Name alias) {
        this(alias, ACCOUNT);
    }

    private Account(Name alias, Table<AccountRecord> aliased) {
        this(alias, aliased, null);
    }

    private Account(Name alias, Table<AccountRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Account(Table<O> child, ForeignKey<O, AccountRecord> key) {
        super(child, key, ACCOUNT);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PRIMARY_KEY_E);
    }

    @Override
    public UniqueKey<AccountRecord> getPrimaryKey() {
        return Keys.PK_ACCOUNT;
    }

    @Override
    public List<UniqueKey<AccountRecord>> getKeys() {
        return Arrays.<UniqueKey<AccountRecord>>asList(Keys.PK_ACCOUNT);
    }

    @Override
    public Account as(String alias) {
        return new Account(DSL.name(alias), this);
    }

    @Override
    public Account as(Name alias) {
        return new Account(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Account rename(String name) {
        return new Account(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Account rename(Name name) {
        return new Account(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<String, Boolean, Boolean, Double, Double, Double, Double, Double, Double, Double, Double, Double, Long> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}
