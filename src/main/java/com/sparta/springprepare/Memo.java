package com.sparta.springprepare;

import lombok.*;

@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@RequiredArgsConstructor // final이 달린 field를 가지는 생성자를 만들어줌
public class Memo {
    private final String username;
    private String contents;

}

class Main{
    public static void main(String[] args){
        Memo memo = new Memo("김우진");
    }
}
