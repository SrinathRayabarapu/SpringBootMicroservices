package com.srinath.user.user.service.vos;

import com.srinath.user.user.service.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

    private Department department;
    private User user;

}
