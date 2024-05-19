package com.team.prototype0.exceptions;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum AuthErrorCode implements ErrorCode {

    //post
    GLOBAL_EXCEPTION(HttpStatus.BAD_REQUEST, "요청 사항을 처리할 수 없습니다"),
    PICS_CREATE_FAIL(HttpStatus.INTERNAL_SERVER_ERROR, "사진 등록이 불가능합니다."),
    USER_MODIFY_FAIL(HttpStatus.INTERNAL_SERVER_ERROR, "작성자 외 수정 및 삭제가 불가능합니다."),
    POST_NOT_FOUND(HttpStatus.INTERNAL_SERVER_ERROR, "게시물이 존재하지 않습니다."),
    POST_REGISTER_FAIL(HttpStatus.INTERNAL_SERVER_ERROR, "게시물을 등록할 수 없습니다"),
    POST_DELETE_FAIL(HttpStatus.INTERNAL_SERVER_ERROR, "게시물을 삭제할 수 없습니다."),
    IMAGE_UPLOAD_FAIL(HttpStatus.BAD_REQUEST,"이미지 업로드에 실패했습니다"),
    VIDEO_UPLOAD_FAIL(HttpStatus.BAD_REQUEST, "동영상 업로드에 실패했습니다."),

    //comment
    COMMENT_NOT_FOUND(HttpStatus.NOT_FOUND, "댓글이 존재하지 않습니다."),
    COMMENT_REGISTER_FAIL(HttpStatus.INTERNAL_SERVER_ERROR, "댓글 등록 및 수정할 수 없습니다."),
    COMMENT_DEELTE_FAIL(HttpStatus.INTERNAL_SERVER_ERROR, "수정이 불가능한 댓글입니다."),

    //user
    DUPLICATED_UID(HttpStatus.BAD_REQUEST, "이미 사용중인 아이디입니다."),
    PASSWORD_NOT_MATCHED(HttpStatus.NOT_FOUND, "비밀번호를 확인해주세요."),
    LOGIN_FAIL(HttpStatus.NOT_FOUND, "아이디와 비밀번호를 확인해주세요."),
    // NOT_FOUND_REFRESH_TOKEN(HttpStatus.NOT_FOUND, "refresh-token 이 없습니다."),
    UNREGISTER_USER(HttpStatus.BAD_REQUEST, "탈퇴한 회원입니다.");

    private final HttpStatus httpStatus;
    private final String message;


}
