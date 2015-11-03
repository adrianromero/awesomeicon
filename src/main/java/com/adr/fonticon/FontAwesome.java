//    FontIcon is a JavaFX library to use FontIcons
//    Copyright (C) 2014 Adrián Romero Corchado.
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
 * Icon Enum based on
 *  Font Awesome 4.4.0 by @davegandy - http://fontawesome.io - @fontawesome
 *  License - http://fontawesome.io/license (Font: SIL OFL 1.1, CSS: MIT License)
 *
 * @author adrian
 */
public enum FontAwesome implements IconFont {

    FA_GLASS('\uF000'),
    FA_MUSIC('\uF001'),
    FA_SEARCH('\uF002'),
    FA_ENVELOPE_O('\uF003'),
    FA_HEART('\uF004'),
    FA_STAR('\uF005'),
    FA_STAR_O('\uF006'),
    FA_USER('\uF007'),
    FA_FILM('\uF008'),
    FA_TH_LARGE('\uF009'),
    FA_TH('\uF00A'),
    FA_TH_LIST('\uF00B'),
    FA_CHECK('\uF00C'),
    FA_REMOVE('\uF00D'),
    FA_CLOSE('\uF00D'),
    FA_TIMES('\uF00D'),
    FA_SEARCH_PLUS('\uF00E'),
    FA_SEARCH_MINUS('\uF010'),
    FA_POWER_OFF('\uF011'),
    FA_SIGNAL('\uF012'),
    FA_GEAR('\uF013'),
    FA_COG('\uF013'),
    FA_TRASH_O('\uF014'),
    FA_HOME('\uF015'),
    FA_FILE_O('\uF016'),
    FA_CLOCK_O('\uF017'),
    FA_ROAD('\uF018'),
    FA_DOWNLOAD('\uF019'),
    FA_ARROW_CIRCLE_O_DOWN('\uF01A'),
    FA_ARROW_CIRCLE_O_UP('\uF01B'),
    FA_INBOX('\uF01C'),
    FA_PLAY_CIRCLE_O('\uF01D'),
    FA_ROTATE_RIGHT('\uF01E'),
    FA_REPEAT('\uF01E'),
    FA_REFRESH('\uF021'),
    FA_LIST_ALT('\uF022'),
    FA_LOCK('\uF023'),
    FA_FLAG('\uF024'),
    FA_HEADPHONES('\uF025'),
    FA_VOLUME_OFF('\uF026'),
    FA_VOLUME_DOWN('\uF027'),
    FA_VOLUME_UP('\uF028'),
    FA_QRCODE('\uF029'),
    FA_BARCODE('\uF02A'),
    FA_TAG('\uF02B'),
    FA_TAGS('\uF02C'),
    FA_BOOK('\uF02D'),
    FA_BOOKMARK('\uF02E'),
    FA_PRINT('\uF02F'),
    FA_CAMERA('\uF030'),
    FA_FONT('\uF031'),
    FA_BOLD('\uF032'),
    FA_ITALIC('\uF033'),
    FA_TEXT_HEIGHT('\uF034'),
    FA_TEXT_WIDTH('\uF035'),
    FA_ALIGN_LEFT('\uF036'),
    FA_ALIGN_CENTER('\uF037'),
    FA_ALIGN_RIGHT('\uF038'),
    FA_ALIGN_JUSTIFY('\uF039'),
    FA_LIST('\uF03A'),
    FA_DEDENT('\uF03B'),
    FA_OUTDENT('\uF03B'),
    FA_INDENT('\uF03C'),
    FA_VIDEO_CAMERA('\uF03D'),
    FA_PHOTO('\uF03E'),
    FA_IMAGE('\uF03E'),
    FA_PICTURE_O('\uF03E'),
    FA_PENCIL('\uF040'),
    FA_MAP_MARKER('\uF041'),
    FA_ADJUST('\uF042'),
    FA_TINT('\uF043'),
    FA_EDIT('\uF044'),
    FA_PENCIL_SQUARE_O('\uF044'),
    FA_SHARE_SQUARE_O('\uF045'),
    FA_CHECK_SQUARE_O('\uF046'),
    FA_ARROWS('\uF047'),
    FA_STEP_BACKWARD('\uF048'),
    FA_FAST_BACKWARD('\uF049'),
    FA_BACKWARD('\uF04A'),
    FA_PLAY('\uF04B'),
    FA_PAUSE('\uF04C'),
    FA_STOP('\uF04D'),
    FA_FORWARD('\uF04E'),
    FA_FAST_FORWARD('\uF050'),
    FA_STEP_FORWARD('\uF051'),
    FA_EJECT('\uF052'),
    FA_CHEVRON_LEFT('\uF053'),
    FA_CHEVRON_RIGHT('\uF054'),
    FA_PLUS_CIRCLE('\uF055'),
    FA_MINUS_CIRCLE('\uF056'),
    FA_TIMES_CIRCLE('\uF057'),
    FA_CHECK_CIRCLE('\uF058'),
    FA_QUESTION_CIRCLE('\uF059'),
    FA_INFO_CIRCLE('\uF05A'),
    FA_CROSSHAIRS('\uF05B'),
    FA_TIMES_CIRCLE_O('\uF05C'),
    FA_CHECK_CIRCLE_O('\uF05D'),
    FA_BAN('\uF05E'),
    FA_ARROW_LEFT('\uF060'),
    FA_ARROW_RIGHT('\uF061'),
    FA_ARROW_UP('\uF062'),
    FA_ARROW_DOWN('\uF063'),
    FA_MAIL_FORWARD('\uF064'),
    FA_SHARE('\uF064'),
    FA_EXPAND('\uF065'),
    FA_COMPRESS('\uF066'),
    FA_PLUS('\uF067'),
    FA_MINUS('\uF068'),
    FA_ASTERISK('\uF069'),
    FA_EXCLAMATION_CIRCLE('\uF06A'),
    FA_GIFT('\uF06B'),
    FA_LEAF('\uF06C'),
    FA_FIRE('\uF06D'),
    FA_EYE('\uF06E'),
    FA_EYE_SLASH('\uF070'),
    FA_WARNING('\uF071'),
    FA_EXCLAMATION_TRIANGLE('\uF071'),
    FA_PLANE('\uF072'),
    FA_CALENDAR('\uF073'),
    FA_RANDOM('\uF074'),
    FA_COMMENT('\uF075'),
    FA_MAGNET('\uF076'),
    FA_CHEVRON_UP('\uF077'),
    FA_CHEVRON_DOWN('\uF078'),
    FA_RETWEET('\uF079'),
    FA_SHOPPING_CART('\uF07A'),
    FA_FOLDER('\uF07B'),
    FA_FOLDER_OPEN('\uF07C'),
    FA_ARROWS_V('\uF07D'),
    FA_ARROWS_H('\uF07E'),
    FA_BAR_CHART_O('\uF080'),
    FA_BAR_CHART('\uF080'),
    FA_TWITTER_SQUARE('\uF081'),
    FA_FACEBOOK_SQUARE('\uF082'),
    FA_CAMERA_RETRO('\uF083'),
    FA_KEY('\uF084'),
    FA_GEARS('\uF085'),
    FA_COGS('\uF085'),
    FA_COMMENTS('\uF086'),
    FA_THUMBS_O_UP('\uF087'),
    FA_THUMBS_O_DOWN('\uF088'),
    FA_STAR_HALF('\uF089'),
    FA_HEART_O('\uF08A'),
    FA_SIGN_OUT('\uF08B'),
    FA_LINKEDIN_SQUARE('\uF08C'),
    FA_THUMB_TACK('\uF08D'),
    FA_EXTERNAL_LINK('\uF08E'),
    FA_SIGN_IN('\uF090'),
    FA_TROPHY('\uF091'),
    FA_GITHUB_SQUARE('\uF092'),
    FA_UPLOAD('\uF093'),
    FA_LEMON_O('\uF094'),
    FA_PHONE('\uF095'),
    FA_SQUARE_O('\uF096'),
    FA_BOOKMARK_O('\uF097'),
    FA_PHONE_SQUARE('\uF098'),
    FA_TWITTER('\uF099'),
    FA_FACEBOOK_F('\uF09A'),
    FA_FACEBOOK('\uF09A'),
    FA_GITHUB('\uF09B'),
    FA_UNLOCK('\uF09C'),
    FA_CREDIT_CARD('\uF09D'),
    FA_FEED('\uF09E'),
    FA_RSS('\uF09E'),
    FA_HDD_O('\uF0A0'),
    FA_BULLHORN('\uF0A1'),
    FA_BELL('\uF0F3'),
    FA_CERTIFICATE('\uF0A3'),
    FA_HAND_O_RIGHT('\uF0A4'),
    FA_HAND_O_LEFT('\uF0A5'),
    FA_HAND_O_UP('\uF0A6'),
    FA_HAND_O_DOWN('\uF0A7'),
    FA_ARROW_CIRCLE_LEFT('\uF0A8'),
    FA_ARROW_CIRCLE_RIGHT('\uF0A9'),
    FA_ARROW_CIRCLE_UP('\uF0AA'),
    FA_ARROW_CIRCLE_DOWN('\uF0AB'),
    FA_GLOBE('\uF0AC'),
    FA_WRENCH('\uF0AD'),
    FA_TASKS('\uF0AE'),
    FA_FILTER('\uF0B0'),
    FA_BRIEFCASE('\uF0B1'),
    FA_ARROWS_ALT('\uF0B2'),
    FA_GROUP('\uF0C0'),
    FA_USERS('\uF0C0'),
    FA_CHAIN('\uF0C1'),
    FA_LINK('\uF0C1'),
    FA_CLOUD('\uF0C2'),
    FA_FLASK('\uF0C3'),
    FA_CUT('\uF0C4'),
    FA_SCISSORS('\uF0C4'),
    FA_COPY('\uF0C5'),
    FA_FILES_O('\uF0C5'),
    FA_PAPERCLIP('\uF0C6'),
    FA_SAVE('\uF0C7'),
    FA_FLOPPY_O('\uF0C7'),
    FA_SQUARE('\uF0C8'),
    FA_NAVICON('\uF0C9'),
    FA_REORDER('\uF0C9'),
    FA_BARS('\uF0C9'),
    FA_LIST_UL('\uF0CA'),
    FA_LIST_OL('\uF0CB'),
    FA_STRIKETHROUGH('\uF0CC'),
    FA_UNDERLINE('\uF0CD'),
    FA_TABLE('\uF0CE'),
    FA_MAGIC('\uF0D0'),
    FA_TRUCK('\uF0D1'),
    FA_PINTEREST('\uF0D2'),
    FA_PINTEREST_SQUARE('\uF0D3'),
    FA_GOOGLE_PLUS_SQUARE('\uF0D4'),
    FA_GOOGLE_PLUS('\uF0D5'),
    FA_MONEY('\uF0D6'),
    FA_CARET_DOWN('\uF0D7'),
    FA_CARET_UP('\uF0D8'),
    FA_CARET_LEFT('\uF0D9'),
    FA_CARET_RIGHT('\uF0DA'),
    FA_COLUMNS('\uF0DB'),
    FA_UNSORTED('\uF0DC'),
    FA_SORT('\uF0DC'),
    FA_SORT_DOWN('\uF0DD'),
    FA_SORT_DESC('\uF0DD'),
    FA_SORT_UP('\uF0DE'),
    FA_SORT_ASC('\uF0DE'),
    FA_ENVELOPE('\uF0E0'),
    FA_LINKEDIN('\uF0E1'),
    FA_ROTATE_LEFT('\uF0E2'),
    FA_UNDO('\uF0E2'),
    FA_LEGAL('\uF0E3'),
    FA_GAVEL('\uF0E3'),
    FA_DASHBOARD('\uF0E4'),
    FA_TACHOMETER('\uF0E4'),
    FA_COMMENT_O('\uF0E5'),
    FA_COMMENTS_O('\uF0E6'),
    FA_FLASH('\uF0E7'),
    FA_BOLT('\uF0E7'),
    FA_SITEMAP('\uF0E8'),
    FA_UMBRELLA('\uF0E9'),
    FA_PASTE('\uF0EA'),
    FA_CLIPBOARD('\uF0EA'),
    FA_LIGHTBULB_O('\uF0EB'),
    FA_EXCHANGE('\uF0EC'),
    FA_CLOUD_DOWNLOAD('\uF0ED'),
    FA_CLOUD_UPLOAD('\uF0EE'),
    FA_USER_MD('\uF0F0'),
    FA_STETHOSCOPE('\uF0F1'),
    FA_SUITCASE('\uF0F2'),
    FA_BELL_O('\uF0A2'),
    FA_COFFEE('\uF0F4'),
    FA_CUTLERY('\uF0F5'),
    FA_FILE_TEXT_O('\uF0F6'),
    FA_BUILDING_O('\uF0F7'),
    FA_HOSPITAL_O('\uF0F8'),
    FA_AMBULANCE('\uF0F9'),
    FA_MEDKIT('\uF0FA'),
    FA_FIGHTER_JET('\uF0FB'),
    FA_BEER('\uF0FC'),
    FA_H_SQUARE('\uF0FD'),
    FA_PLUS_SQUARE('\uF0FE'),
    FA_ANGLE_DOUBLE_LEFT('\uF100'),
    FA_ANGLE_DOUBLE_RIGHT('\uF101'),
    FA_ANGLE_DOUBLE_UP('\uF102'),
    FA_ANGLE_DOUBLE_DOWN('\uF103'),
    FA_ANGLE_LEFT('\uF104'),
    FA_ANGLE_RIGHT('\uF105'),
    FA_ANGLE_UP('\uF106'),
    FA_ANGLE_DOWN('\uF107'),
    FA_DESKTOP('\uF108'),
    FA_LAPTOP('\uF109'),
    FA_TABLET('\uF10A'),
    FA_MOBILE_PHONE('\uF10B'),
    FA_MOBILE('\uF10B'),
    FA_CIRCLE_O('\uF10C'),
    FA_QUOTE_LEFT('\uF10D'),
    FA_QUOTE_RIGHT('\uF10E'),
    FA_SPINNER('\uF110'),
    FA_CIRCLE('\uF111'),
    FA_MAIL_REPLY('\uF112'),
    FA_REPLY('\uF112'),
    FA_GITHUB_ALT('\uF113'),
    FA_FOLDER_O('\uF114'),
    FA_FOLDER_OPEN_O('\uF115'),
    FA_SMILE_O('\uF118'),
    FA_FROWN_O('\uF119'),
    FA_MEH_O('\uF11A'),
    FA_GAMEPAD('\uF11B'),
    FA_KEYBOARD_O('\uF11C'),
    FA_FLAG_O('\uF11D'),
    FA_FLAG_CHECKERED('\uF11E'),
    FA_TERMINAL('\uF120'),
    FA_CODE('\uF121'),
    FA_MAIL_REPLY_ALL('\uF122'),
    FA_REPLY_ALL('\uF122'),
    FA_STAR_HALF_EMPTY('\uF123'),
    FA_STAR_HALF_FULL('\uF123'),
    FA_STAR_HALF_O('\uF123'),
    FA_LOCATION_ARROW('\uF124'),
    FA_CROP('\uF125'),
    FA_CODE_FORK('\uF126'),
    FA_UNLINK('\uF127'),
    FA_CHAIN_BROKEN('\uF127'),
    FA_QUESTION('\uF128'),
    FA_INFO('\uF129'),
    FA_EXCLAMATION('\uF12A'),
    FA_SUPERSCRIPT('\uF12B'),
    FA_SUBSCRIPT('\uF12C'),
    FA_ERASER('\uF12D'),
    FA_PUZZLE_PIECE('\uF12E'),
    FA_MICROPHONE('\uF130'),
    FA_MICROPHONE_SLASH('\uF131'),
    FA_SHIELD('\uF132'),
    FA_CALENDAR_O('\uF133'),
    FA_FIRE_EXTINGUISHER('\uF134'),
    FA_ROCKET('\uF135'),
    FA_MAXCDN('\uF136'),
    FA_CHEVRON_CIRCLE_LEFT('\uF137'),
    FA_CHEVRON_CIRCLE_RIGHT('\uF138'),
    FA_CHEVRON_CIRCLE_UP('\uF139'),
    FA_CHEVRON_CIRCLE_DOWN('\uF13A'),
    FA_HTML5('\uF13B'),
    FA_CSS3('\uF13C'),
    FA_ANCHOR('\uF13D'),
    FA_UNLOCK_ALT('\uF13E'),
    FA_BULLSEYE('\uF140'),
    FA_ELLIPSIS_H('\uF141'),
    FA_ELLIPSIS_V('\uF142'),
    FA_RSS_SQUARE('\uF143'),
    FA_PLAY_CIRCLE('\uF144'),
    FA_TICKET('\uF145'),
    FA_MINUS_SQUARE('\uF146'),
    FA_MINUS_SQUARE_O('\uF147'),
    FA_LEVEL_UP('\uF148'),
    FA_LEVEL_DOWN('\uF149'),
    FA_CHECK_SQUARE('\uF14A'),
    FA_PENCIL_SQUARE('\uF14B'),
    FA_EXTERNAL_LINK_SQUARE('\uF14C'),
    FA_SHARE_SQUARE('\uF14D'),
    FA_COMPASS('\uF14E'),
    FA_TOGGLE_DOWN('\uF150'),
    FA_CARET_SQUARE_O_DOWN('\uF150'),
    FA_TOGGLE_UP('\uF151'),
    FA_CARET_SQUARE_O_UP('\uF151'),
    FA_TOGGLE_RIGHT('\uF152'),
    FA_CARET_SQUARE_O_RIGHT('\uF152'),
    FA_EURO('\uF153'),
    FA_EUR('\uF153'),
    FA_GBP('\uF154'),
    FA_DOLLAR('\uF155'),
    FA_USD('\uF155'),
    FA_RUPEE('\uF156'),
    FA_INR('\uF156'),
    FA_CNY('\uF157'),
    FA_RMB('\uF157'),
    FA_YEN('\uF157'),
    FA_JPY('\uF157'),
    FA_RUBLE('\uF158'),
    FA_ROUBLE('\uF158'),
    FA_RUB('\uF158'),
    FA_WON('\uF159'),
    FA_KRW('\uF159'),
    FA_BITCOIN('\uF15A'),
    FA_BTC('\uF15A'),
    FA_FILE('\uF15B'),
    FA_FILE_TEXT('\uF15C'),
    FA_SORT_ALPHA_ASC('\uF15D'),
    FA_SORT_ALPHA_DESC('\uF15E'),
    FA_SORT_AMOUNT_ASC('\uF160'),
    FA_SORT_AMOUNT_DESC('\uF161'),
    FA_SORT_NUMERIC_ASC('\uF162'),
    FA_SORT_NUMERIC_DESC('\uF163'),
    FA_THUMBS_UP('\uF164'),
    FA_THUMBS_DOWN('\uF165'),
    FA_YOUTUBE_SQUARE('\uF166'),
    FA_YOUTUBE('\uF167'),
    FA_XING('\uF168'),
    FA_XING_SQUARE('\uF169'),
    FA_YOUTUBE_PLAY('\uF16A'),
    FA_DROPBOX('\uF16B'),
    FA_STACK_OVERFLOW('\uF16C'),
    FA_INSTAGRAM('\uF16D'),
    FA_FLICKR('\uF16E'),
    FA_ADN('\uF170'),
    FA_BITBUCKET('\uF171'),
    FA_BITBUCKET_SQUARE('\uF172'),
    FA_TUMBLR('\uF173'),
    FA_TUMBLR_SQUARE('\uF174'),
    FA_LONG_ARROW_DOWN('\uF175'),
    FA_LONG_ARROW_UP('\uF176'),
    FA_LONG_ARROW_LEFT('\uF177'),
    FA_LONG_ARROW_RIGHT('\uF178'),
    FA_APPLE('\uF179'),
    FA_WINDOWS('\uF17A'),
    FA_ANDROID('\uF17B'),
    FA_LINUX('\uF17C'),
    FA_DRIBBBLE('\uF17D'),
    FA_SKYPE('\uF17E'),
    FA_FOURSQUARE('\uF180'),
    FA_TRELLO('\uF181'),
    FA_FEMALE('\uF182'),
    FA_MALE('\uF183'),
    FA_GITTIP('\uF184'),
    FA_GRATIPAY('\uF184'),
    FA_SUN_O('\uF185'),
    FA_MOON_O('\uF186'),
    FA_ARCHIVE('\uF187'),
    FA_BUG('\uF188'),
    FA_VK('\uF189'),
    FA_WEIBO('\uF18A'),
    FA_RENREN('\uF18B'),
    FA_PAGELINES('\uF18C'),
    FA_STACK_EXCHANGE('\uF18D'),
    FA_ARROW_CIRCLE_O_RIGHT('\uF18E'),
    FA_ARROW_CIRCLE_O_LEFT('\uF190'),
    FA_TOGGLE_LEFT('\uF191'),
    FA_CARET_SQUARE_O_LEFT('\uF191'),
    FA_DOT_CIRCLE_O('\uF192'),
    FA_WHEELCHAIR('\uF193'),
    FA_VIMEO_SQUARE('\uF194'),
    FA_TURKISH_LIRA('\uF195'),
    FA_TRY('\uF195'),
    FA_PLUS_SQUARE_O('\uF196'),
    FA_SPACE_SHUTTLE('\uF197'),
    FA_SLACK('\uF198'),
    FA_ENVELOPE_SQUARE('\uF199'),
    FA_WORDPRESS('\uF19A'),
    FA_OPENID('\uF19B'),
    FA_INSTITUTION('\uF19C'),
    FA_BANK('\uF19C'),
    FA_UNIVERSITY('\uF19C'),
    FA_MORTAR_BOARD('\uF19D'),
    FA_GRADUATION_CAP('\uF19D'),
    FA_YAHOO('\uF19E'),
    FA_GOOGLE('\uF1A0'),
    FA_REDDIT('\uF1A1'),
    FA_REDDIT_SQUARE('\uF1A2'),
    FA_STUMBLEUPON_CIRCLE('\uF1A3'),
    FA_STUMBLEUPON('\uF1A4'),
    FA_DELICIOUS('\uF1A5'),
    FA_DIGG('\uF1A6'),
    FA_PIED_PIPER('\uF1A7'),
    FA_PIED_PIPER_ALT('\uF1A8'),
    FA_DRUPAL('\uF1A9'),
    FA_JOOMLA('\uF1AA'),
    FA_LANGUAGE('\uF1AB'),
    FA_FAX('\uF1AC'),
    FA_BUILDING('\uF1AD'),
    FA_CHILD('\uF1AE'),
    FA_PAW('\uF1B0'),
    FA_SPOON('\uF1B1'),
    FA_CUBE('\uF1B2'),
    FA_CUBES('\uF1B3'),
    FA_BEHANCE('\uF1B4'),
    FA_BEHANCE_SQUARE('\uF1B5'),
    FA_STEAM('\uF1B6'),
    FA_STEAM_SQUARE('\uF1B7'),
    FA_RECYCLE('\uF1B8'),
    FA_AUTOMOBILE('\uF1B9'),
    FA_CAR('\uF1B9'),
    FA_CAB('\uF1BA'),
    FA_TAXI('\uF1BA'),
    FA_TREE('\uF1BB'),
    FA_SPOTIFY('\uF1BC'),
    FA_DEVIANTART('\uF1BD'),
    FA_SOUNDCLOUD('\uF1BE'),
    FA_DATABASE('\uF1C0'),
    FA_FILE_PDF_O('\uF1C1'),
    FA_FILE_WORD_O('\uF1C2'),
    FA_FILE_EXCEL_O('\uF1C3'),
    FA_FILE_POWERPOINT_O('\uF1C4'),
    FA_FILE_PHOTO_O('\uF1C5'),
    FA_FILE_PICTURE_O('\uF1C5'),
    FA_FILE_IMAGE_O('\uF1C5'),
    FA_FILE_ZIP_O('\uF1C6'),
    FA_FILE_ARCHIVE_O('\uF1C6'),
    FA_FILE_SOUND_O('\uF1C7'),
    FA_FILE_AUDIO_O('\uF1C7'),
    FA_FILE_MOVIE_O('\uF1C8'),
    FA_FILE_VIDEO_O('\uF1C8'),
    FA_FILE_CODE_O('\uF1C9'),
    FA_VINE('\uF1CA'),
    FA_CODEPEN('\uF1CB'),
    FA_JSFIDDLE('\uF1CC'),
    FA_LIFE_BOUY('\uF1CD'),
    FA_LIFE_BUOY('\uF1CD'),
    FA_LIFE_SAVER('\uF1CD'),
    FA_SUPPORT('\uF1CD'),
    FA_LIFE_RING('\uF1CD'),
    FA_CIRCLE_O_NOTCH('\uF1CE'),
    FA_RA('\uF1D0'),
    FA_REBEL('\uF1D0'),
    FA_GE('\uF1D1'),
    FA_EMPIRE('\uF1D1'),
    FA_GIT_SQUARE('\uF1D2'),
    FA_GIT('\uF1D3'),
    FA_Y_COMBINATOR_SQUARE('\uF1D4'),
    FA_YC_SQUARE('\uF1D4'),
    FA_HACKER_NEWS('\uF1D4'),
    FA_TENCENT_WEIBO('\uF1D5'),
    FA_QQ('\uF1D6'),
    FA_WECHAT('\uF1D7'),
    FA_WEIXIN('\uF1D7'),
    FA_SEND('\uF1D8'),
    FA_PAPER_PLANE('\uF1D8'),
    FA_SEND_O('\uF1D9'),
    FA_PAPER_PLANE_O('\uF1D9'),
    FA_HISTORY('\uF1DA'),
    FA_CIRCLE_THIN('\uF1DB'),
    FA_HEADER('\uF1DC'),
    FA_PARAGRAPH('\uF1DD'),
    FA_SLIDERS('\uF1DE'),
    FA_SHARE_ALT('\uF1E0'),
    FA_SHARE_ALT_SQUARE('\uF1E1'),
    FA_BOMB('\uF1E2'),
    FA_SOCCER_BALL_O('\uF1E3'),
    FA_FUTBOL_O('\uF1E3'),
    FA_TTY('\uF1E4'),
    FA_BINOCULARS('\uF1E5'),
    FA_PLUG('\uF1E6'),
    FA_SLIDESHARE('\uF1E7'),
    FA_TWITCH('\uF1E8'),
    FA_YELP('\uF1E9'),
    FA_NEWSPAPER_O('\uF1EA'),
    FA_WIFI('\uF1EB'),
    FA_CALCULATOR('\uF1EC'),
    FA_PAYPAL('\uF1ED'),
    FA_GOOGLE_WALLET('\uF1EE'),
    FA_CC_VISA('\uF1F0'),
    FA_CC_MASTERCARD('\uF1F1'),
    FA_CC_DISCOVER('\uF1F2'),
    FA_CC_AMEX('\uF1F3'),
    FA_CC_PAYPAL('\uF1F4'),
    FA_CC_STRIPE('\uF1F5'),
    FA_BELL_SLASH('\uF1F6'),
    FA_BELL_SLASH_O('\uF1F7'),
    FA_TRASH('\uF1F8'),
    FA_COPYRIGHT('\uF1F9'),
    FA_AT('\uF1FA'),
    FA_EYEDROPPER('\uF1FB'),
    FA_PAINT_BRUSH('\uF1FC'),
    FA_BIRTHDAY_CAKE('\uF1FD'),
    FA_AREA_CHART('\uF1FE'),
    FA_PIE_CHART('\uF200'),
    FA_LINE_CHART('\uF201'),
    FA_LASTFM('\uF202'),
    FA_LASTFM_SQUARE('\uF203'),
    FA_TOGGLE_OFF('\uF204'),
    FA_TOGGLE_ON('\uF205'),
    FA_BICYCLE('\uF206'),
    FA_BUS('\uF207'),
    FA_IOXHOST('\uF208'),
    FA_ANGELLIST('\uF209'),
    FA_CC('\uF20A'),
    FA_SHEKEL('\uF20B'),
    FA_SHEQEL('\uF20B'),
    FA_ILS('\uF20B'),
    FA_MEANPATH('\uF20C'),
    FA_BUYSELLADS('\uF20D'),
    FA_CONNECTDEVELOP('\uF20E'),
    FA_DASHCUBE('\uF210'),
    FA_FORUMBEE('\uF211'),
    FA_LEANPUB('\uF212'),
    FA_SELLSY('\uF213'),
    FA_SHIRTSINBULK('\uF214'),
    FA_SIMPLYBUILT('\uF215'),
    FA_SKYATLAS('\uF216'),
    FA_CART_PLUS('\uF217'),
    FA_CART_ARROW_DOWN('\uF218'),
    FA_DIAMOND('\uF219'),
    FA_SHIP('\uF21A'),
    FA_USER_SECRET('\uF21B'),
    FA_MOTORCYCLE('\uF21C'),
    FA_STREET_VIEW('\uF21D'),
    FA_HEARTBEAT('\uF21E'),
    FA_VENUS('\uF221'),
    FA_MARS('\uF222'),
    FA_MERCURY('\uF223'),
    FA_INTERSEX('\uF224'),
    FA_TRANSGENDER('\uF224'),
    FA_TRANSGENDER_ALT('\uF225'),
    FA_VENUS_DOUBLE('\uF226'),
    FA_MARS_DOUBLE('\uF227'),
    FA_VENUS_MARS('\uF228'),
    FA_MARS_STROKE('\uF229'),
    FA_MARS_STROKE_V('\uF22A'),
    FA_MARS_STROKE_H('\uF22B'),
    FA_NEUTER('\uF22C'),
    FA_GENDERLESS('\uF22D'),
    FA_FACEBOOK_OFFICIAL('\uF230'),
    FA_PINTEREST_P('\uF231'),
    FA_WHATSAPP('\uF232'),
    FA_SERVER('\uF233'),
    FA_USER_PLUS('\uF234'),
    FA_USER_TIMES('\uF235'),
    FA_HOTEL('\uF236'),
    FA_BED('\uF236'),
    FA_VIACOIN('\uF237'),
    FA_TRAIN('\uF238'),
    FA_SUBWAY('\uF239'),
    FA_MEDIUM('\uF23A'),
    FA_YC('\uF23B'),
    FA_Y_COMBINATOR('\uF23B'),
    FA_OPTIN_MONSTER('\uF23C'),
    FA_OPENCART('\uF23D'),
    FA_EXPEDITEDSSL('\uF23E'),
    FA_BATTERY_4('\uF240'),
    FA_BATTERY_FULL('\uF240'),
    FA_BATTERY_3('\uF241'),
    FA_BATTERY_THREE_QUARTERS('\uF241'),
    FA_BATTERY_2('\uF242'),
    FA_BATTERY_HALF('\uF242'),
    FA_BATTERY_1('\uF243'),
    FA_BATTERY_QUARTER('\uF243'),
    FA_BATTERY_0('\uF244'),
    FA_BATTERY_EMPTY('\uF244'),
    FA_MOUSE_POINTER('\uF245'),
    FA_I_CURSOR('\uF246'),
    FA_OBJECT_GROUP('\uF247'),
    FA_OBJECT_UNGROUP('\uF248'),
    FA_STICKY_NOTE('\uF249'),
    FA_STICKY_NOTE_O('\uF24A'),
    FA_CC_JCB('\uF24B'),
    FA_CC_DINERS_CLUB('\uF24C'),
    FA_CLONE('\uF24D'),
    FA_BALANCE_SCALE('\uF24E'),
    FA_HOURGLASS_O('\uF250'),
    FA_HOURGLASS_1('\uF251'),
    FA_HOURGLASS_START('\uF251'),
    FA_HOURGLASS_2('\uF252'),
    FA_HOURGLASS_HALF('\uF252'),
    FA_HOURGLASS_3('\uF253'),
    FA_HOURGLASS_END('\uF253'),
    FA_HOURGLASS('\uF254'),
    FA_HAND_GRAB_O('\uF255'),
    FA_HAND_ROCK_O('\uF255'),
    FA_HAND_STOP_O('\uF256'),
    FA_HAND_PAPER_O('\uF256'),
    FA_HAND_SCISSORS_O('\uF257'),
    FA_HAND_LIZARD_O('\uF258'),
    FA_HAND_SPOCK_O('\uF259'),
    FA_HAND_POINTER_O('\uF25A'),
    FA_HAND_PEACE_O('\uF25B'),
    FA_TRADEMARK('\uF25C'),
    FA_REGISTERED('\uF25D'),
    FA_CREATIVE_COMMONS('\uF25E'),
    FA_GG('\uF260'),
    FA_GG_CIRCLE('\uF261'),
    FA_TRIPADVISOR('\uF262'),
    FA_ODNOKLASSNIKI('\uF263'),
    FA_ODNOKLASSNIKI_SQUARE('\uF264'),
    FA_GET_POCKET('\uF265'),
    FA_WIKIPEDIA_W('\uF266'),
    FA_SAFARI('\uF267'),
    FA_CHROME('\uF268'),
    FA_FIREFOX('\uF269'),
    FA_OPERA('\uF26A'),
    FA_INTERNET_EXPLORER('\uF26B'),
    FA_TV('\uF26C'),
    FA_TELEVISION('\uF26C'),
    FA_CONTAO('\uF26D'),
    FA_500PX('\uF26E'),
    FA_AMAZON('\uF270'),
    FA_CALENDAR_PLUS_O('\uF271'),
    FA_CALENDAR_MINUS_O('\uF272'),
    FA_CALENDAR_TIMES_O('\uF273'),
    FA_CALENDAR_CHECK_O('\uF274'),
    FA_INDUSTRY('\uF275'),
    FA_MAP_PIN('\uF276'),
    FA_MAP_SIGNS('\uF277'),
    FA_MAP_O('\uF278'),
    FA_MAP('\uF279'),
    FA_COMMENTING('\uF27A'),
    FA_COMMENTING_O('\uF27B'),
    FA_HOUZZ('\uF27C'),
    FA_VIMEO('\uF27D'),
    FA_BLACK_TIE('\uF27E'),
    FA_FONTICONS('\uF280');
    
    private static String AWESOMEFONT = null;
    
    static {
        try {
            AWESOMEFONT = Font.loadFont(FontAwesome.class.getResourceAsStream("fonts/fontawesome-webfont.ttf"), 10.0).getName();    
        } catch (Exception e) {
        }
    } 
    
    private final char character;

    private FontAwesome(char character) {
        this.character = character;
    }

    @Override
    public char getChar() {
        return character;
    }

    @Override
    public String getFontName() {
        return AWESOMEFONT;
    }
}
