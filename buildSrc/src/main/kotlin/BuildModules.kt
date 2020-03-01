/*
 * Copyright 2019 vmadalin.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Configuration of build modules
 */
object BuildModules {
    const val MOBILE_UI = ":mobile-ui"
    const val CORE = ":core"

    object Features {
        const val ARTICLES = ":features:articles"
        const val ARTICLE_DETAILS = ":features:articledetails"
        const val ABOUT = ":features:about"
        const val BOOKMARKS = ":features:bookmarks"
        const val CATEGORIES = ":features:categories"
        const val SEARCH = ":features:search"
        const val SETTINGS = ":features:settings"
    }

    object Commons {
        const val UI = ":commons:ui"
        const val VIEWS = ":commons:views"
    }

    object Libraries {
        const val DATA = ":libraries:data"
        const val DOMAIN = ":libraries:domain"
        const val CACHE = ":libraries:cache"
        const val PRESENTATION = ":presentation"
        const val REMOTE = ":libraries:remote"

        const val TEST_UTILS = ":libraries:test_utils"
    }
}