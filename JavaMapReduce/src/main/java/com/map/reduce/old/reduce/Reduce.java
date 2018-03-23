package com.map.reduce.old.reduce;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.Reporter;

import java.io.IOException;
import java.util.Iterator;

/**
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 13:55 2018/3/23
 * @Modified By:
 */
public class Reduce extends MapReduceBase implements Reducer<Text, IntWritable, Text, IntWritable>
{
    @Override
    public void reduce(Text text, Iterator<IntWritable> values, OutputCollector<Text, IntWritable> outputCollector,
            Reporter reporter) throws IOException
    {
        int sum = 0;
        while (values.hasNext())
        {
            sum += values.next().get();
        }
        outputCollector.collect(text, new IntWritable(sum));
    }
}
