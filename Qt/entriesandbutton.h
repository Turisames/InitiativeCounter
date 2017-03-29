#ifndef ENTRIESANDBUTTON_H
#define ENTRIESANDBUTTON_H

#include "mainwindow.h"
#include <QWidget>
#include <QLinkedList>

namespace Ui {
class EntriesAndButton;
}

class EntriesAndButton : public QWidget
{
    Q_OBJECT

public:
    explicit EntriesAndButton(QWidget *parent = 0);
    ~EntriesAndButton();

private slots:
    void on_pushButton_clicked();

private:
    Ui::EntriesAndButton *ui;

    QLinkedList<combatant> * model_;
};

#endif // ENTRIESANDBUTTON_H
