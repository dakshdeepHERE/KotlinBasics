package OOPs

abstract class ShapeDrawer {

    abstract fun drawLine(fromX: Int, fromY: Int, toX: Int, toY: Int)

    fun drawSquare(x: Int, y: Int, size: Int) {
        drawLine(x, y, x + size, y)
        drawLine(x + size, y, x + size, y + size)
        drawLine(x, y, x, y + size)
        drawLine(x, y + size, x + size, y + size)
    }

    fun drawRectangle(x: Int, y: Int, height: Int, width: Int) {
        drawLine(x, y, x + width, y)
        drawLine(x + width, y, x + width, y + height)
        drawLine(x, y, x, y + height)
        drawLine(x, y + height, x + width, y + height)
    }
}


class AndroidShapeDrawer: ShapeDrawer() {
    override fun drawLine(fromX: Int, fromY: Int, toX: Int, toY: Int) { /*...*/ }
}

class WebsiteShapeDrawer: ShapeDrawer() {
    override fun drawLine(fromX: Int, fromY: Int, toX: Int, toY: Int) { /*...*/ }
}

class TerminalShapeDrawer: ShapeDrawer() {
    override fun drawLine(fromX: Int, fromY: Int, toX: Int, toY: Int) { /*...*/ }
}
