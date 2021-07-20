/*
 * This file is generated by jOOQ.
 */
package io.github.quickmsg.persistent.tables.tables.records;


import io.github.quickmsg.persistent.tables.tables.SmqttRetain;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SmqttRetainRecord extends TableRecordImpl<SmqttRetainRecord> implements Record5<String, Integer, String, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    public void setTopic(String value) {
        set(0, value);
    }


    public String getTopic() {
        return (String) get(0);
    }


    public void setQos(Integer value) {
        set(1, value);
    }


    public Integer getQos() {
        return (Integer) get(1);
    }


    public void setBody(String value) {
        set(2, value);
    }


    public String getBody() {
        return (String) get(2);
    }

    public void setCreateTime(LocalDateTime value) {
        set(3, value);
    }

    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(3);
    }


    public void setUpdateTime(LocalDateTime value) {
        set(4, value);
    }


    public LocalDateTime getUpdateTime() {
        return (LocalDateTime) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, Integer, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<String, Integer, String, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return SmqttRetain.SMQTT_RETAIN.TOPIC;
    }

    @Override
    public Field<Integer> field2() {
        return SmqttRetain.SMQTT_RETAIN.QOS;
    }

    @Override
    public Field<String> field3() {
        return SmqttRetain.SMQTT_RETAIN.BODY;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return SmqttRetain.SMQTT_RETAIN.CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return SmqttRetain.SMQTT_RETAIN.UPDATE_TIME;
    }

    @Override
    public String component1() {
        return getTopic();
    }

    @Override
    public Integer component2() {
        return getQos();
    }

    @Override
    public String component3() {
        return getBody();
    }

    @Override
    public LocalDateTime component4() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime component5() {
        return getUpdateTime();
    }

    @Override
    public String value1() {
        return getTopic();
    }

    @Override
    public Integer value2() {
        return getQos();
    }

    @Override
    public String value3() {
        return getBody();
    }

    @Override
    public LocalDateTime value4() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime value5() {
        return getUpdateTime();
    }

    @Override
    public SmqttRetainRecord value1(String value) {
        setTopic(value);
        return this;
    }

    @Override
    public SmqttRetainRecord value2(Integer value) {
        setQos(value);
        return this;
    }

    @Override
    public SmqttRetainRecord value3(String value) {
        setBody(value);
        return this;
    }

    @Override
    public SmqttRetainRecord value4(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public SmqttRetainRecord value5(LocalDateTime value) {
        setUpdateTime(value);
        return this;
    }

    @Override
    public SmqttRetainRecord values(String value1, Integer value2, String value3, LocalDateTime value4, LocalDateTime value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------


    public SmqttRetainRecord() {
        super(SmqttRetain.SMQTT_RETAIN);
    }


    public SmqttRetainRecord(String topic, Integer qos, String body, LocalDateTime createTime, LocalDateTime updateTime) {
        super(SmqttRetain.SMQTT_RETAIN);

        setTopic(topic);
        setQos(qos);
        setBody(body);
        setCreateTime(createTime);
        setUpdateTime(updateTime);
    }
}
