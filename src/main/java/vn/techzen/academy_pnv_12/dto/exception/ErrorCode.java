package vn.techzen.academy_pnv_12.dto.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public enum ErrorCode {
    STUDENT_NOT_EXIST(40401, "Student is not exist!", HttpStatus.NOT_FOUND),
    TEACHER_NOT_EXIST(40402, "Teacher is not exist!", HttpStatus.NOT_FOUND),
    ;

    Integer code;
    String message;
    HttpStatus status;
}
