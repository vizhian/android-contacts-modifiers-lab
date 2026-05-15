package ru.yandex.practicum.contacts.presentation.sort;

// класс UiState должен иметь package-private доступ
class SortUiState {

    // сделайте поля isApplyEnable и newSelectedSortType приватными
    private boolean isApplyEnable = false;
    private String newSelectedSortType = null;

    // реализуйте get и set методы для обоих полей
    boolean getIsApplyEnable() {
        return isApplyEnable;
    }

    void setIsApplyEnable(boolean isApplyEnable) {
        this.isApplyEnable = isApplyEnable;
    }

    String getNewSelectedSortType() {
        return newSelectedSortType;
    }

    void setNewSelectedSortType(String newSelectedSortType) {
        this.newSelectedSortType = newSelectedSortType;
    }

}
