//    FontIcon is a JavaFX library to use FontIcons
//    Copyright (C) 2020 Adrián Romero Corchado.
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
package com.adr.fonticon.browser;

import com.adr.fonticon.IconBuilder;
import com.adr.fonticon.IconFont;
import com.adr.fonticon.decorator.LightOff;
import com.adr.fonticon.decorator.LightOn;
import com.adr.fonticon.decorator.ShadowHigh;
import com.adr.fonticon.decorator.ShadowHole;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

/**
 *
 * @author adrian
 */
public class IconDetails {

    private final Label title;
    private final Label description1;
    private final Label description2;
    private final Label description3;
    private final Label terms;
    private final HBox sizer;
    private final HBox sizer2;
    private final VBox box;

    public IconDetails() {
        title = new Label();
        title.getStyleClass().add("title-icon");

        description1 = new Label();
        description1.getStyleClass().add("description-icon");

        description2 = new Label();
        description2.getStyleClass().add("description-icon");

        description3 = new Label();
        description3.getStyleClass().add("description-icon");

        terms = new Label();
        terms.getStyleClass().add("terms-icon");

        sizer = new HBox();
        sizer.getStyleClass().add("sizer-icon");

        sizer2 = new HBox();
        sizer2.getStyleClass().add("sizer-icon");

        box = new VBox(title, description1, description2, description3, terms, sizer, sizer2);
    }

    public Node getNode() {
        return box;
    }

    public void clear() {
        title.setText("");
        description1.setText("");
        description2.setText("");
        description3.setText("");
        terms.setText("");
        sizer.getChildren().clear();
        sizer2.getChildren().clear();
    }

    public void displayDetails(IconFont icon) {
        title.setText(icon.toString());
        if (icon.toString().startsWith("FA_")) {
            description1.setText("Font Awesome 5.12.0 by @davegandy");
            description2.setText("https://github.com/FortAwesome/Font-Awesome");
            description3.setText("(Icons: CC BY 4.0, Fonts: SIL OFL 1.1, Code: MIT License)");

        } else if (icon.toString().startsWith("WI_")) {
            description1.setText("Weather Icons 2.0.10 by Erik Flowers");
            description2.setText("https://erikflowers.github.io/weather-icons");
            description3.setText("(Fonts: SIL OFL 1.1, Code: MIT License, Documentation: CC BY 3.0)");

        } else {
            description1.setText("");
            description2.setText("");
            description3.setText("");

        }
        terms.setText(String.join(", ", icon.getTerms()));
        sizer.getChildren().clear();
        sizer.getChildren().addAll(
                IconBuilder.create(icon, 12.0).styleClass("icon-size").build(),
                IconBuilder.create(icon, 16.0).styleClass("icon-size").build(),
                IconBuilder.create(icon, 20.0).styleClass("icon-size").build(),
                IconBuilder.create(icon, 24.0).styleClass("icon-size").build(),
                IconBuilder.create(icon, 28.0).styleClass("icon-size").build(),
                IconBuilder.create(icon, 32.0).styleClass("icon-size").build(),
                IconBuilder.create(icon, 40.0).styleClass("icon-size").build(),
                IconBuilder.create(icon, 48.0).styleClass("icon-size").build(),
                IconBuilder.create(icon, 52.0).styleClass("icon-size").build(),
                IconBuilder.create(icon, 56.0).styleClass("icon-size").build()
        );
        sizer2.getChildren().clear();
        sizer2.getChildren().addAll(
                IconBuilder.create(icon, 52.0).color(Color.LIGHTGRAY).shine(Color.YELLOW).build(),
                IconBuilder.create(icon, 52.0).apply(new LightOn(Color.AQUA)).build(),
                IconBuilder.create(icon, 52.0).apply(new LightOff()).build(),
                IconBuilder.create(icon, 52.0).color(Color.RED).apply(new ShadowHigh(Color.BLUE)).build(),
                IconBuilder.create(icon, 52.0).apply(new ShadowHole(Color.AZURE)).build()
        );
    }
}
