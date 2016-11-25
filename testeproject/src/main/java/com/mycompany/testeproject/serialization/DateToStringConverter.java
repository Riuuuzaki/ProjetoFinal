/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testeproject.serialization;

import java.util.Date;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.core.convert.converter.Converter;

/**
 *
 * @author enomurak
 */
public class DateToStringConverter implements Converter<Date, String> {

    @Override
    public String convert(Date date) {
        return DateFormatUtils.ISO_8601_EXTENDED_DATETIME_FORMAT.format(date);
    }

}
