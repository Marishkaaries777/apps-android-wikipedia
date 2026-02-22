import androidx.appcompat.widget.AppCompatImageView
import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.check.KCheckBox
import io.github.kakaocup.kakao.common.views.KView
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.progress.KSeekBar
import io.github.kakaocup.kakao.switch.KSwitch
import io.github.kakaocup.kakao.tabs.KTabLayout
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView
import io.github.kakaocup.kakao.toolbar.KToolbar
import org.wikipedia.R

object Theme : KScreen<Theme>(){
    override val layoutId: Int? = null
    override val viewClass: Class<*>? = null

    val readingText = KTextView{
        withId(R.id.textSettingsCategory)
    }

    val textSize = KTextView{
        withId(R.id.text_size_percent)
    }

    val buttonDecreaseT = KButton{
        withId(R.id.buttonDecreaseTextSize)
    }

    val buttonIncreaseT = KButton{
        withId(R.id.buttonIncreaseTextSize)
    }

    val textSizeBar = KSeekBar{
        withId(R.id.text_size_seek_bar)
    }

    val buttonSansSerif = KButton{
        withId(R.id.button_font_family_sans_serif)
    }

    val buttonSerif = KButton{
        withId(R.id.button_font_family_serif)
    }

    val glassesImage = KImageView{
        withParent {
            withId(R.id.readingFocusModeContainer)
        }
        isInstanceOf(AppCompatImageView :: class.java)
    }
    val modeSwitcher = KCheckBox{
        withId(R.id.theme_chooser_reading_focus_mode_switch)
    }

    val underSwitcherText = KTextView{
        withId(R.id.theme_chooser_reading_focus_mode_description)
    }

    val themeText = KTextView{
        containsText("Theme")
    }

    val lightThemeButton = KButton{
        withId(R.id.button_theme_light)
    }

    val sepiaThemeButton = KButton{
        withId(R.id.button_theme_sepia)
    }

    val darkThemeButton = KButton{
        withId(R.id.button_theme_dark)
    }

    val blackThemeButton = KButton{
        withId(R.id.button_theme_black)
    }

    val themeSwitcher = KCheckBox{
        withId(R.id.theme_chooser_match_system_theme_switch)
    }

    val imageDismissSwitcher = KSwitch{
        withId(R.id.theme_chooser_dark_mode_dim_images_switch)
    }
}

fun main(){
    Theme.buttonSerif.isDisplayed()
    Theme.modeSwitcher.containsText("Reading focus mode ")
    Theme.blackThemeButton.click()
    Theme.imageDismissSwitcher.isDisabled()
}