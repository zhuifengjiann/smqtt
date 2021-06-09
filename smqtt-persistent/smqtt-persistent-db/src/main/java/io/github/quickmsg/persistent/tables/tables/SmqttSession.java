/*
 * This file is generated by jOOQ.
 */
package io.github.quickmsg.persistent.tables.tables;


import io.github.quickmsg.persistent.tables.Smqtt;
import io.github.quickmsg.persistent.tables.tables.records.SmqttSessionRecord;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SmqttSession extends TableImpl<SmqttSessionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>smqtt.smqtt_session</code>
     */
    public static final SmqttSession SMQTT_SESSION = new SmqttSession();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SmqttSessionRecord> getRecordType() {
        return SmqttSessionRecord.class;
    }

    /**
     * The column <code>smqtt.smqtt_session.topic</code>. 话题
     */
    public final TableField<SmqttSessionRecord, String> TOPIC = createField(DSL.name("topic"), SQLDataType.VARCHAR(255).defaultValue(DSL.inline("NULL", SQLDataType.VARCHAR)), this, "话题");

    /**
     * The column <code>smqtt.smqtt_session.client_id</code>. 客户端ID
     */
    public final TableField<SmqttSessionRecord, String> CLIENT_ID = createField(DSL.name("client_id"), SQLDataType.VARCHAR(255).defaultValue(DSL.inline("NULL", SQLDataType.VARCHAR)), this, "客户端ID");

    /**
     * The column <code>smqtt.smqtt_session.qos</code>. qos
     */
    public final TableField<SmqttSessionRecord, Integer> QOS = createField(DSL.name("qos"), SQLDataType.INTEGER.defaultValue(DSL.inline("NULL", SQLDataType.INTEGER)), this, "qos");

    /**
     * The column <code>smqtt.smqtt_session.body</code>. 消息内容
     */
    public final TableField<SmqttSessionRecord, String> BODY = createField(DSL.name("body"), SQLDataType.VARCHAR(255).defaultValue(DSL.inline("NULL", SQLDataType.VARCHAR)), this, "消息内容");

    /**
     * The column <code>smqtt.smqtt_session.create_time</code>. 记录保存时间
     */
    public final TableField<SmqttSessionRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.inline("NULL", SQLDataType.LOCALDATETIME)), this, "记录保存时间");

    private SmqttSession(Name alias, Table<SmqttSessionRecord> aliased) {
        this(alias, aliased, null);
    }

    private SmqttSession(Name alias, Table<SmqttSessionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>smqtt.smqtt_session</code> table reference
     */
    public SmqttSession(String alias) {
        this(DSL.name(alias), SMQTT_SESSION);
    }

    /**
     * Create an aliased <code>smqtt.smqtt_session</code> table reference
     */
    public SmqttSession(Name alias) {
        this(alias, SMQTT_SESSION);
    }

    /**
     * Create a <code>smqtt.smqtt_session</code> table reference
     */
    public SmqttSession() {
        this(DSL.name("smqtt_session"), null);
    }

    public <O extends Record> SmqttSession(Table<O> child, ForeignKey<O, SmqttSessionRecord> key) {
        super(child, key, SMQTT_SESSION);
    }

    @Override
    public Schema getSchema() {
        return Smqtt.SMQTT;
    }

    @Override
    public SmqttSession as(String alias) {
        return new SmqttSession(DSL.name(alias), this);
    }

    @Override
    public SmqttSession as(Name alias) {
        return new SmqttSession(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SmqttSession rename(String name) {
        return new SmqttSession(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SmqttSession rename(Name name) {
        return new SmqttSession(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, Integer, String, LocalDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
