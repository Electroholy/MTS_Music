package mobile.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ToastRemoveFromRec {
    FIRST_MESSAGE("Спрятали этого исполнителя от вас"),
    SECOND_MESSAGE("Хорошо, больше такого не посоветуем"),
    THIRD_MESSAGE("Учли, включим что-то более подходящее"),
    FOURTH_MESSAGE("Исключили из рекомендаций"),
    FIFTH_MESSAGE("Убрали из рекомендаций"),
    SIXTH_MESSAGE("Отметили, больше такого не посоветуем"),
    SEVENTH_MESSAGE("Хорошо, поставим что-нибудь другое"),
    EIGHTH_MESSAGE("Договорились, больше не включим");
    private final String value;
}
