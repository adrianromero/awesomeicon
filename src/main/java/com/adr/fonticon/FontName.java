//    FontIcon is a JavaFX library to use FontIcons
//    Copyright (C) 2014-2020 Adrián Romero Corchado.
//
//    This file is part of FontIcon
//
//     Licensed under the Apache License, Version 2.0 (the "License");
//     you may not use this file except in compliance with the License.
//     You may obtain a copy of the License at
//
//         http://www.apache.org/licenses/LICENSE-2.0
//
//     Unless required by applicable law or agreed to in writing, software
//     distributed under the License is distributed on an "AS IS" BASIS,
//     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//     See the License for the specific language governing permissions and
//     limitations under the License.
package com.adr.fonticon;

import javafx.scene.text.Font;

/**
 *
 * @author adrian
 */
public class FontName {

    public static String SOLID;
    public static String REGULAR;
    public static String BRANDS;
    public static String WEATHER;

    static {
        try {
            SOLID = Font.loadFont(IconFont.class.getResourceAsStream("fonts/fa-solid-900.ttf"), 10.0).getName();
            REGULAR = Font.loadFont(IconFont.class.getResourceAsStream("fonts/fa-regular-400.ttf"), 10.0).getName();
            BRANDS = Font.loadFont(IconFont.class.getResourceAsStream("fonts/fa-brands-400.ttf"), 10.0).getName();
            WEATHER = Font.loadFont(IconFont.class.getResourceAsStream("fonts/weathericons-regular-webfont.ttf"), 10.0).getName();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
