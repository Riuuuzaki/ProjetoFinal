/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.serializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.Date;
import org.apache.commons.lang3.time.DateFormatUtils;

/**
 *
 * @author araujoav
 */
public class GsonDateSerialization implements JsonDeserializer<Date>, JsonSerializer<Date> {

    @Override
    public Date deserialize(JsonElement je, Type type, JsonDeserializationContext jdc) throws JsonParseException {
        Date parsedDate;
        try {
            parsedDate = DateFormatUtils.ISO_8601_EXTENDED_DATETIME_FORMAT.parse(je.getAsString());
        } catch (ParseException ex) {
            throw new JsonIOException(ex);
        }
        return parsedDate;
    }

    @Override
    public JsonElement serialize(Date t, Type type, JsonSerializationContext jsc) {
        JsonObject jsonObject = new JsonObject();

        jsonObject.addProperty("data", t.getTime());
        
        final JsonElement jsonAuthros = jsc.serialize(t.getTime());
         

        return jsonObject;
    }
}
