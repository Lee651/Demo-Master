package com.xiaomage.configuration;


import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

/**
 * redisson配置
 *
 * @author xiaomage
 * @date 2022/12/25
 */
public class RedissonConfiguration {

    // 此处更换自己的 Redis 地址即可
    @Value("${redis.addr}")
    private String addr;

    @Bean
    public RedissonClient redisson() {
        Config config = new Config();
        config.useSingleServer()
                .setAddress(String.format("%s%s", "redis://", addr))
                .setConnectionPoolSize(64)              // 连接池大小
                .setConnectionMinimumIdleSize(8)        // 保持最小连接数
                .setConnectTimeout(1500)                // 建立连接超时时间
                .setTimeout(2000)                       // 执行命令的超时时间, 从命令发送成功时开始计时
                .setRetryAttempts(2)                    // 命令执行失败重试次数
                .setRetryInterval(1000);                // 命令重试发送时间间隔

        return Redisson.create(config);
    }



}
