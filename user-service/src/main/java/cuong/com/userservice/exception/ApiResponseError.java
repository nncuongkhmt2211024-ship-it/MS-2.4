package cuong.com.userservice.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponseError {
    private String timestamp;
    private int status;
    private String error;
    private String message;

    // Hàm tiện ích để tự động lấy thời gian hiện tại
    public static ApiResponseError of(int status, String error, String message) {
        return ApiResponseError.builder()
                .timestamp(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME))
                .status(status)
                .error(error)
                .message(message)
                .build();
    }
}