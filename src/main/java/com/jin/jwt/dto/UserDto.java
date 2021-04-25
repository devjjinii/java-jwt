package com.jin.jwt.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    @NotNull
    @Size(min = 3, max = 50)
    private String username;

    //해당 필드는 오직 쓰려는 경우(deserialize)에만 접근이 허용.
    //사용자를 생성하기 위한 요청 본문을 처리할 때는 사용되고,
    //응답결과를 생성할 때는 해당 필드는 제외되서 응답 본문에 표시되지 않게됨.
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull
    @Size(min = 3, max = 100)
    private String password;

    @NotNull
    @Size(min = 3, max = 50)
    private String nickname;
}