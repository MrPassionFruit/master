package com.map.reduce.old.map;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;

import java.io.IOException;
import java.util.StringTokenizer;

/**
 * map结构
 *
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 10:48 2018/3/23
 * @Modified By:
 */
public class MaxTemperatureMapper extends MapReduceBase implements Mapper<LongWritable, Text, Text, IntWritable>
{
    private final static IntWritable one = new IntWritable(1);
    private Text word = new Text();

    /**
     * @param longWritable    类型相当于Java中的Long类型
     * @param value            类型相当于Java中的String类型
     * @param outputCollector IntWritable 类型相当于Java中的Integer类型
     * @param reporter
     * @throws IOException
     */
    @Override
    public void map(LongWritable longWritable, Text value, OutputCollector<Text, IntWritable> outputCollector,
            Reporter reporter) throws IOException
    {
        String line = value.toString();
        StringTokenizer tokenizer = new StringTokenizer(line);
        while (tokenizer.hasMoreTokens())
        {
            word.set(tokenizer.nextToken());
            outputCollector.collect(word, one);
        }
    }

    public static void main(String[] args)
    {
        StringTokenizer tokenizer = new StringTokenizer("hjds\njjsf\tgcb哈哈哈哈哈1216421");
        while (tokenizer.hasMoreTokens())
        {
            System.out.println(tokenizer.nextToken());
        }
    }

}
