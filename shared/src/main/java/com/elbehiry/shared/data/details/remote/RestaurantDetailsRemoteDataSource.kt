/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.elbehiry.shared.data.details.remote

import com.elbehiry.model.RestaurantDetails
import com.elbehiry.shared.data.details.mapper.toRestaurantModel
import com.elbehiry.shared.data.remote.DiningApi
import javax.inject.Inject

class RestaurantDetailsRemoteDataSource @Inject constructor(
    private val api: DiningApi
) : DetailsDataSource {
    override suspend fun getDetails(venueId: String, version: String): RestaurantDetails =
        api.getDetails(venueId, version).toRestaurantModel()
}
