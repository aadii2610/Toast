package aio.app.toastlibrary

import android.content.Context
import android.widget.Toast

object Commons {
    fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}
