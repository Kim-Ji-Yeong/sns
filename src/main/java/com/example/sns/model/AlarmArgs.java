package com.example.sns.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlarmArgs {

    // 알람을 발생 시킨 사람
    private Integer fromUserId;
    private Integer targetId;
}
