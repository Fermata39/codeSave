package write;

import input.InputAccount;

import java.util.List;

public interface Writer {
    void write(List<InputAccount> list); // interface 에선 접근자가 무조건 public 이다
}
