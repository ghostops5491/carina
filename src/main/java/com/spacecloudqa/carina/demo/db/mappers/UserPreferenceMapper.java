package com.spacecloudqa.carina.demo.db.mappers;

import com.spacecloudqa.carina.demo.db.models.UserPreference;

public interface UserPreferenceMapper {

	void create(UserPreference userPreference);

	UserPreference findById(Long id);

}
