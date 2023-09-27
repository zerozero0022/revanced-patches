package app.revanced.patches.youtube.utils.fix.parameter.fingerprints

import app.revanced.patcher.extensions.or
import app.revanced.patcher.fingerprint.method.impl.MethodFingerprint
import com.android.tools.smali.dexlib2.AccessFlags

object StoryboardRendererSpecFingerprint : MethodFingerprint(
    accessFlags = AccessFlags.PUBLIC or AccessFlags.STATIC,
    returnType = "L",
    parameters = listOf("Ljava/lang/String;", "J"),
    strings = listOf("\\|"),
)