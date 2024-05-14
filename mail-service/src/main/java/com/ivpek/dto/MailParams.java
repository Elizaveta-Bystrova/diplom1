package com.ivpek.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class MailParams extends com.ivpek.utils.dto.MailParams {
    private String id;
    private String emailTo;
}
