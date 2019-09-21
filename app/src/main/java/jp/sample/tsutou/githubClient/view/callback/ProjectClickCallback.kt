package jp.sample.tsutou.githubClient.view.callback

import jp.sample.tsutou.githubClient.service.model.Project

/**
 * @link onClick(Project project) 詳細画面に移動
 */
interface ProjectClickCallback {
    fun onClick(project: Project)
}
