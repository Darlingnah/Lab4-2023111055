package com.ai;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class L2023111055_2_Test{

    @Test
    public void testSolution2()
    {
        Solution2 solution = new Solution2();

        // 测试目的：验证方法能否正确处理无重复字母的字符串
        // 测试用例：输入 "abc"，期望输出 "abc"
        assertEquals("abc", solution.removeDuplicateLetters("abc"));

        // 测试目的：验证方法能否正确处理有重复字母的字符串
        // 测试用例：输入 "bcabc"，期望输出 "abc"
        assertEquals("abc", solution.removeDuplicateLetters("bcabc"));

        // 测试目的：验证方法能否正确处理包含多个重复字母的字符串
        // 测试用例：输入 "cbacdcbc"，期望输出 "acdb"
        assertEquals("acdb", solution.removeDuplicateLetters("cbacdcbc"));

        // 测试目的：验证方法能否正确处理空字符串
        // 测试用例：输入 ""，期望输出 ""
        assertEquals("", solution.removeDuplicateLetters(""));

        // 测试目的：验证方法能否正确处理单个字符的字符串
        // 测试用例：输入 "a"，期望输出 "a"
        assertEquals("a", solution.removeDuplicateLetters("a"));

        // 测试目的：验证方法能否正确处理所有字符相同的字符串
        // 测试用例：输入 "aaa"，期望输出 "a"
        assertEquals("a", solution.removeDuplicateLetters("aaa"));
    }
}