/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testeproject.serialization;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonSyntaxException;
import java.text.ParseException;
import java.util.Date;
import java.lang.reflect.Type;
import org.apache.commons.lang3.time.DateFormatUtils;

/**
 *
 * @author enomurak
 */ 
public class GsonDateSerialization implements JsonSerializer<Date>, JsonDeserializer<Date> {

   

    @Override
    public JsonElement serialize(Date date, Type type, JsonSerializationContext jsonSerializationContext) {
        String dateFormatAsString = DateFormatUtils.ISO_8601_EXTENDED_DATETIME_FORMAT.format(date);
        return new JsonPrimitive(dateFormatAsString);
    }

    @Override
    public Date deserialize(JsonElement jsonElement, Type type,
            JsonDeserializationContext jsonDeserializationContext) {
        Date date;
        try {
            date = DateFormatUtils.ISO_8601_EXTENDED_DATETIME_FORMAT.parse(jsonElement.getAsString());
        } catch (ParseException e) {
            throw new JsonSyntaxException(jsonElement.getAsString(), e);
        }
        return date;
    }
}
