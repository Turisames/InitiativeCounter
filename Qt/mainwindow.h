#ifndef MAINWINDOW_H
#define MAINWINDOW_H

#include <QMainWindow>
#include <QString>
#include <QLinkedList>

struct combatant{
    QString name{""};
    unsigned int initiative{0};
};

namespace Ui {
class MainWindow;
}

class MainWindow : public QMainWindow
{
    Q_OBJECT

public:
    explicit MainWindow(QWidget *parent = 0);
    ~MainWindow();

    void addCombatant(QString Name, unsigned int Init);
    void edit();
    void clear();

private:
    Ui::MainWindow *ui;

    void sort();

    // Model
    // Saves names and initiative values
    // TODO: Make a whole
    QLinkedList<combatant> model_;
};

#endif // MAINWINDOW_H
