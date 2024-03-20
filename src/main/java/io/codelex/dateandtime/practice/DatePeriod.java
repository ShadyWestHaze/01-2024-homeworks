package src.main.java.io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class DatePeriod {
    private final LocalDate START;
    private final LocalDate END;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.START = start;
        this.END = end;
    }

    public LocalDate getStart() {
        return START;
    }

    public LocalDate getEnd() {
        return END;
    }

    public DatePeriod intersection(DatePeriod other) {
        LocalDate intersectionStart = this.START.isAfter(other.START) ? this.START : other.START;
        LocalDate intersectionEnd = this.END.isBefore(other.END) ? this.END : other.END;
        if (intersectionStart.isAfter(intersectionEnd)) {
            return null;
        } else {
            return new DatePeriod(intersectionStart, intersectionEnd);
        }
    }
}