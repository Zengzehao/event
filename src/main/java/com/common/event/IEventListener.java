package com.common.event;

/**
 * @Author: zengzehao
 * @CreateTime: 2019-11-07 11:44
 * @Description: 事件监听器
 */
public interface IEventListener {
    void handle(IEvent event);
}
