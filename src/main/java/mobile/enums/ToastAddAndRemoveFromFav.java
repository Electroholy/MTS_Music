package mobile.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ToastAddAndRemoveFromFav {
    REMOVE_ARTIST_FROM_FAVORITE("Убрали исполнителя из Избранного");
    private final String value;
}
