package org.example.Entity;

import lombok.*;
import org.example.Entity.Enum.Role;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Security {

    private String username;
    private String parol;
    private Role role;







}
