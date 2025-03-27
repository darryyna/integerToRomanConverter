package edu.lytvyniuk;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/*
  @author darin
  @project integerToRoman
  @class CustomConverterTest
  @version 1.0.0
  @since 27.03.2025 - 18.57
*/
class CustomConverterTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void whenArabic_3_ThenRoman_III() {
        Assertions.assertEquals("III", CustomConverter.arabicToRoman(3));
    }

    @Test
    void whenArabic_10_ThenRoman_X() {
        Assertions.assertEquals("X", CustomConverter.arabicToRoman(10));
    }

    @Test
    void whenArabic_14_ThenRoman_XIV() {
        Assertions.assertEquals("XIV", CustomConverter.arabicToRoman(14));
    }

    @Test
    void whenArabic_18_ThenRoman_XVIII() {
        Assertions.assertEquals("XVIII", CustomConverter.arabicToRoman(18));
    }

    @Test
    void whenArabic_19_ThenRoman_XIX() {
        Assertions.assertEquals("XIX", CustomConverter.arabicToRoman(19));
    }

    @Test
    void whenArabic_20_ThenRoman_XX() {
        Assertions.assertEquals("XX", CustomConverter.arabicToRoman(20));
    }

    @Test
    void whenArabic_28_ThenRoman_XXVIII() {
        Assertions.assertEquals("XXVIII", CustomConverter.arabicToRoman(28));
    }

    @Test
    void whenArabic_38_ThenRoman_XXXVIII() {
        Assertions.assertEquals("XXXVIII", CustomConverter.arabicToRoman(38));
    }

    @Test
    void whenArabic_40_ThenRoman_XL() {
        Assertions.assertEquals("XL", CustomConverter.arabicToRoman(40));
    }

    @Test
    void whenArabic_48_ThenRoman_XLVIII() {
        Assertions.assertEquals("XLVIII", CustomConverter.arabicToRoman(48));
    }

    @Test
    void whenArabic_50_ThenRoman_L() {
        Assertions.assertEquals("L", CustomConverter.arabicToRoman(50));
    }

    @Test
    void whenArabic_58_ThenRoman_LVIII() {
        Assertions.assertEquals("LVIII", CustomConverter.arabicToRoman(58));
    }


    @Test
    void whenArabic_88_ThenRoman_LXXXVIII() {
        Assertions.assertEquals("LXXXVIII", CustomConverter.arabicToRoman(88));
    }

    @Test
    void whenArabic_90_ThenRoman_XC() {
        Assertions.assertEquals("XC", CustomConverter.arabicToRoman(90));
    }

    @Test
    void whenArabic_99_ThenRoman_XCIX() {
        Assertions.assertEquals("XCIX", CustomConverter.arabicToRoman(99));
    }

    @Test
    void whenArabic_100_ThenRoman_C() {
        Assertions.assertEquals("C", CustomConverter.arabicToRoman(100));
    }

    @Test
    void whenArabic_213_ThenRoman_CCXIII() {
        Assertions.assertEquals("CCXIII", CustomConverter.arabicToRoman(213));
    }

    @Test
    void whenArabic_357_ThenRoman_CCCLVII() {
        Assertions.assertEquals("CCCLVII", CustomConverter.arabicToRoman(357));
    }

    @Test
    void whenArabic_426_ThenRoman_CDXXVI() {
        Assertions.assertEquals("CDXXVI", CustomConverter.arabicToRoman(426));
    }

    @Test
    void whenArabic_589_ThenRoman_DLXXXIX() {
        Assertions.assertEquals("DLXXXIX", CustomConverter.arabicToRoman(589));
    }

    @Test
    void whenArabic_642_ThenRoman_DCXLII() {
        Assertions.assertEquals("DCXLII", CustomConverter.arabicToRoman(642));
    }

    @Test
    void whenArabic_777_ThenRoman_DCCLXXVII() {
        Assertions.assertEquals("DCCLXXVII", CustomConverter.arabicToRoman(777));
    }

    @Test
    void whenArabic_894_ThenRoman_DCCCXCIV() {
        Assertions.assertEquals("DCCCXCIV", CustomConverter.arabicToRoman(894));
    }

    @Test
    void whenArabic_1134_ThenRoman_MCXXXIV() {
        Assertions.assertEquals("MCXXXIV", CustomConverter.arabicToRoman(1134));
    }

    @Test
    void whenArabic_1546_ThenRoman_MDXLVi() {
        Assertions.assertEquals("MDXLVI", CustomConverter.arabicToRoman(1546));
    }

    @Test
    void whenArabic_2345_ThenRoman_MMCCCXLV() {
        Assertions.assertEquals("MMCCCXLV", CustomConverter.arabicToRoman(2345));
    }

    @Test
    void whenArabic_3789_ThenRoman_MMMDCCCLXXXIX() {
        Assertions.assertEquals("MMMDCCLXXXIX", CustomConverter.arabicToRoman(3789));
    }
}