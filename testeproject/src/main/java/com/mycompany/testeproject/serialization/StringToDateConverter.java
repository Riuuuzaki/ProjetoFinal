///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.mycompany.testeproject.serialization;
//
//import java.text.ParseException;
//import java.util.Date;
//import org.apache.commons.lang3.time.DateFormatUtils;
//import org.springframework.core.convert.converter.Converter;
//
///**
// *
// * @author enomurak
// */
//public class StringToDateConverter implements Converter<String, Date> {
//
//    @Override
//    public Date convert(String dateString) {
//        try {
//            return DateFormatUtils.ISO_8601_EXTENDED_DATETIME_FORMAT.parse(dateString);
//        } catch (ParseException ex) {
//            return null;
//        }
//    }
//
//}
