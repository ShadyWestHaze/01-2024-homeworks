package src.main.java.io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class DatePeriod {
    private final LocalDate start;
    private final LocalDate end;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public DatePeriod intersection(DatePeriod other) {
        LocalDate intersectionStart = this.start.isAfter(other.start) ? this.start : other.start;
        LocalDate intersectionEnd = this.end.isBefore(other.end) ? this.end : other.end;
        if (intersectionStart.isAfter(intersectionEnd)) {
            return null;
        } else {
            return new DatePeriod(intersectionStart, intersectionEnd);
        }
    }
}