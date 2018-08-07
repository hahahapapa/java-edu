package examples.boot.myshop1.security;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MemberInfo {
    private Long id;
    private String email;
}
