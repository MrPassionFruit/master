package com.map.reduce.old;

import com.map.reduce.old.map.MaxTemperatureMapper;
import com.map.reduce.old.reduce.Reduce;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.*;

import java.io.IOException;

/**
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 13:57 2018/3/23
 * @Modified By:
 */
public class Main
{
    public static void main(String[] args) throws IOException
    {
        JobConf conf= new JobConf();
        conf.setJarByClass(Main.class);
        conf.setJobName("wordcount");
        conf.setOutputKeyClass(Text.class);
        conf.setOutputValueClass(IntWritable.class);
        //map拆分
        conf.setMapperClass(MaxTemperatureMapper.class);
        //中间结果合并(避免给网络数据传输产生压力)
        conf.setCombinerClass(Reduce.class);
        //合并
        conf.setReducerClass(Reduce.class);
        conf.setInputFormat(TextInputFormat.class);
        conf.setOutputFormat(TextOutputFormat.class);
        FileInputFormat.addInputPath(conf, new Path(args[0]));
        FileInputFormat.addInputPath(conf, new Path(args[1]));
        FileOutputFormat.setOutputPath(conf, new Path(args[2]));
        JobClient.runJob(conf);
    }
}
