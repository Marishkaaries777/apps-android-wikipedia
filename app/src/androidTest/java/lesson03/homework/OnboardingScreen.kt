package lesson03.homework

import androidx.appcompat.widget.AppCompatImageView
import com.google.android.material.button.MaterialButton
import org.wikipedia.R
import org.wikipedia.views.AppTextView

val globusImage = listOf(
    AppCompatImageView::class.java,
    R.id.imageViewCentered
)

val titleOnboarding = listOf(
    AppTextView::class.java,
    R.id.primaryTextView,
    R.string.onboarding_welcome_title_v2
)

val subtitleOnboarding = listOf(
    AppTextView::class.java,
    R.id.secondaryTextView,
    R.string.onboarding_multilingual_secondary_text
)

val languageOption = listOf(
    AppTextView::class.java,
    R.id.option_label
)

val addOrEditButton = listOf(
    MaterialButton::class.java,
    R.id.addLanguageButton,
    R.string.onboarding_multilingual_add_language_text
)

val skipButton = listOf(
    MaterialButton::class.java,
    R.id.fragment_onboarding_skip_button,
    R.string.onboarding_skip
)

val continueButton = listOf(
    MaterialButton::class.java,
    R.id.fragment_onboarding_forward_button,
    R.string.onboarding_continue
)

val secondSPageImage = listOf(
    AppCompatImageView::class.java,
    R.id.imageViewCentered
)

val secondPageTitle = listOf(
    AppTextView::class.java,
    R.id.primaryTextView,
    R.string.onboarding_explore_title
)

val secondPageSubtitle = listOf(
    AppTextView::class.java,
    R.id.secondaryTextView,
    R.string.onboarding_explore_text
)