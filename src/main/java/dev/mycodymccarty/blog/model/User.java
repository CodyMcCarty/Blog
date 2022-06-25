package dev.mycodymccarty.blog.model;

import dev.mycodymccarty.blog.model.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
//    private String email;
//    private Role role;
    private Boolean isVerified;
}
