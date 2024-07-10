package com.example.springboot1.controller;


import com.example.springboot1.mapper.RunoobTblMapper;
import com.example.springboot1.po.RunoobTbl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    RunoobTblMapper runoobTblMapper;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @RequestMapping("/testMysql")
    public String testMysql() {

        RunoobTbl runoobTbl =  runoobTblMapper.selectByPrimaryKey(1);
        return "Hello World";
    }

    //给我实现一个快速排序算法
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int i = low, j = high, temp = arr[low];
            while (i < j) {
                while (i < j && arr[j] >= temp) {
                    j--;
                }
                if (i < j) {
                    arr[i] = arr[j];
                    i++;
                }
                while (i < j && arr[i] < temp) {
                    i++;
                }
                if (i <j) {
                }
            }
        }

        arr[i] = temp;
        quickSort(arr, low, i - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        quickSort(arr, 0, arr.length - 1);
        for (   )
    }

}