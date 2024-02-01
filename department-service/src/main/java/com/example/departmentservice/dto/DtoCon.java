package com.example.departmentservice.dto;

import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class DtoCon {
    private int id;
    @NonNull
    private String name;
}
