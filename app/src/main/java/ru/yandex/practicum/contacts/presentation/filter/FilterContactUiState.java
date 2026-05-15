package ru.yandex.practicum.contacts.presentation.filter;

import java.util.Collections;
import java.util.Set;

import ru.yandex.practicum.contacts.model.ContactType;

class FilterContactUiState {
    private boolean isApplyEnable = false;
    private Set<ContactType> newSelectedContactTypes = Collections.emptySet();

    boolean getIsApplyEnable() {
        return isApplyEnable;
    }

    void setIsApplyEnable(boolean isApplyEnable) {
        this.isApplyEnable = isApplyEnable;
    }

    Set<ContactType> getNewSelectedContactTypes() {
        return newSelectedContactTypes;
    }

    void setNewSelectedContactTypes(Set<ContactType> newSelectedContactTypes) {
        this.newSelectedContactTypes = newSelectedContactTypes;
    }


}
